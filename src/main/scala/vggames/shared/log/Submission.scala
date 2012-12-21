package vggames.shared.log

import java.sql.Date
import org.scalaquery.ql.TypeMapper.{ BooleanTypeMapper, DateTypeMapper, StringTypeMapper }
import org.scalaquery.ql.extended.ExtendedTable
import org.scalaquery.ql.extended.SQLiteDriver.Implicit.columnBaseToInsertInvoker
import org.scalaquery.session.Database.threadLocalSession
import vggames.shared.task.{ JudgedTask, Task }
import vggames.shared.Database
import vggames.shared.player.Player

case class Submission(gameName : String, task : Task[_], challenge : String, result : JudgedTask, player:Option[Player], ip : Option[String]) extends LogItem with Database {
  def log {
    onDatabase {
      Submissions.insert(gameName, task.getChallenge, challenge, result.ok, player.map(_.id), ip)
    }
  }
}

object Submissions extends ExtendedTable[(String, String, String, Boolean, Option[Long], Option[String])]("submissions") {

  def game = column[String]("game")
  def task = column[String]("task")
  def challenge = column[String]("challenge")
  def passed = column[Boolean]("passed")
  def playerId = column[Option[Long]]("playerId")
  def playerIp = column[Option[String]]("playerIp")

  def * = game ~ task ~ challenge ~ passed  ~ playerId ~ playerIp
}