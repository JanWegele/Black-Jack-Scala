package BlackJack
package aview

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class TUISpec extends AnyWordSpec {
  "A BlackJack TUI" should {
    val tui = new TUI(2)
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
