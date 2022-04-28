package BlackJack.model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class GridSpec extends AnyWordSpec {
  val grid = new Grid(2)
  "Grid" should {
    "have a table created by Strings where its width is dependent on the player count and is in the form  '+------------------------------+'" in {
      grid.border() should be("+-----------------------+" + grid.eol)
    }
    "have an empty space on the table where no cards or anything else is placed in the form '|                             |'" in {
      grid.emptyLine() should be("|                       |" + grid.eol)
    }
    "have a card width for the dealer challenging the players" in {
      grid.dealerBorder() should be("|        +-----+        |" + grid.eol)
    }
    "have a card height for the dealer challenging the players" in {
      grid.dealerBody() should be("|        |     |        |" + grid.eol +
        "|        |     |        |" + grid.eol +
        "|        |     |        |" + grid.eol)
    }
    "have a card width for the player challenging the players" in {
      grid.playerBorder() should be("|   +-----+   +-----+   |" + grid.eol)
    }
    "have a card height for the player challenging the players" in {
      grid.playerBody() should be("|   |     |   |     |   |" + grid.eol +
        "|   |     |   |     |   |" + grid.eol +
        "|   |     |   |     |   |" + grid.eol)
    }
    "have a table with all the cards laying on it" in {
      grid.render() should be(
          "+-----------------------+" + grid.eol +
          "|                       |" + grid.eol +
          "|        +-----+        |" + grid.eol +
          "|        |     |        |" + grid.eol +
          "|        |     |        |" + grid.eol +
          "|        |     |        |" + grid.eol +
          "|        +-----+        |" + grid.eol +
          "|                       |" + grid.eol +
          "|                       |" + grid.eol +
          "|   +-----+   +-----+   |" + grid.eol +
          "|   |     |   |     |   |" + grid.eol +
          "|   |     |   |     |   |" + grid.eol +
          "|   |     |   |     |   |" + grid.eol +
          "|   +-----+   +-----+   |" + grid.eol +
          "|                       |" + grid.eol +
          "+-----------------------+" + grid.eol
      )
    }


  }
}
