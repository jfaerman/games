package vggames.regex.task

import vggames.shared.task.JudgedTask
import vggames.shared.task.Task

class TestTask extends Task[Any] {
  def judge(challenge : String) : JudgedTask = null
  def getChallenge() : String = null
  def resource = ""
}
