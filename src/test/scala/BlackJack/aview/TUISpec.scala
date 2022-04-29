package BlackJack
package aview

import controller.Controller
import model.Grid
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._


class TUISpec extends AnyWordSpec {
  "A BlackJack TUI" should {
    val controller = Controller(new Grid(2))
    val tui = TUI(controller)
    "create a new BlackJack table on input 'c'" in {
      tui.inputLoop("c")
      tui.grid.render() should be(
          "+-----------------------+" + tui.eol +
          "|                       |" + tui.eol +
          "|        +-----+        |" + tui.eol +
          "|        |     |        |" + tui.eol +
          "|        |     |        |" + tui.eol +
          "|        |     |        |" + tui.eol +
          "|        +-----+        |" + tui.eol +
          "|                       |" + tui.eol +
          "|                       |" + tui.eol +
          "|   +-----+   +-----+   |" + tui.eol +
          "|   |     |   |     |   |" + tui.eol +
          "|   |     |   |     |   |" + tui.eol +
          "|   |     |   |     |   |" + tui.eol +
          "|   +-----+   +-----+   |" + tui.eol +
          "|                       |" + tui.eol +
          "+-----------------------+" + tui.eol
      )
    }
  }
}
