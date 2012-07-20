package vggames.css

import vggames.shared.task.Descriptions
import br.com.caelum.vraptor.ioc.Component
import vggames.shared.Game
import vggames.shared.task.Tasks

@Component
class CssGame(descriptions : Descriptions) extends Game {

  val tasks : Tasks = new Tasks

  addTestTask

  def addTestTask = {
  }

  def getDescription = "Um jogo muito legal para aprender CSS"

  def getName : String = "CSS"

}