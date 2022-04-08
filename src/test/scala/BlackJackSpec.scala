import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class BlackJackSpec extends AnyWordSpec {
  "BlackJack" should {
    "have a table created by Strings where its width is in the form '+------------------------------+'" in {
      tableWidth() should be("+------------------------------+" + eo1)
    }
    "have a table created by Strings where its length is in the form '|                              |'" in {
      cells() should be("|                              |" + eo1)
    }

    "have a line separator" in {
      eo1 should be (sys.props("line.separator"))
    }

    "have a method that checks if the width is valid" in {
      widthCalc(10) should be (10)
      widthCalc(-1) should be (widthDefault)
      widthCalc(15) should be (16)
    }

    "have a method that checks if the length is valid" in {
      lengthCalc(13) should be (lengthDefault)
      lengthCalc(-1) should be (lengthDefault)
      lengthCalc(4) should be (4)

    }

    "have a scalable table width" in {
      tableWidth(10) should be("+----------+" + eo1)
      tableWidth(20) should be("+--------------------+" + eo1)
      tableWidth(15) should be("+----------------+" + eo1)

      cells(10) should be ("|          |" + eo1)
      cells(20) should be ("|                    |" + eo1)
      cells(15) should be ("|                |" + eo1)
    }


    "have cards that adjusts according to the table width calculated by a method" in {
      widthForCard(56) should be (25)
      widthForCard(10) should be (2)
      widthForCard(25) should be (10)
    }

    "have non-scalable cards" in {
      cardWidth() should be ("+----+")
      cardLength() should be ("|    |")
    }

    "adjust the card´s width to the table" in {
      cardTotalWidth(10) should be ("|  +----+  |" + eo1)
      cardTotalWidth(56) should be ("|                         +----+                         |" + eo1)
      cardTotalWidth(25) should be ("|          +----+          |" + eo1)
    }

    "adjust the card´s height to the table" in {
      cardTotalHeight(10) should be ("|  |    |  |" + eo1)
      cardTotalHeight(56) should be ("|                         |    |                         |" + eo1)
      cardTotalHeight(25) should be ("|          |    |          |" + eo1)
    }

    "adjust the cards width and length to table" in {
      cardTotal(10) should be ("|  +----+  |" + eo1
        + "|  |    |  |" + eo1
        + "|  |    |  |" + eo1
        + "|  +----+  |" + eo1 )
      cardTotal(56) should be ("|                         +----+                         |" + eo1
        + "|                         |    |                         |" + eo1
        + "|                         |    |                         |" + eo1
        + "|                         +----+                         |" + eo1 )
      cardTotal(25) should be ("|          +----+          |" + eo1
        + "|          |    |          |" + eo1
        + "|          |    |          |" + eo1
        + "|          +----+          |" + eo1 )
    }

    "put everything together to create the whole table" in {
      mesh(10, 2) should be ("+----------+" + eo1
        + "|  +----+  |" + eo1
        + "|  |    |  |" + eo1
        + "|  |    |  |" + eo1
        + "|  +----+  |" + eo1
        + "|          |" + eo1
        + "|          |" + eo1
        + "|  +----+  |" + eo1
        + "|  |    |  |" + eo1
        + "|  |    |  |" + eo1
        + "|  +----+  |" + eo1
        + "+----------+" + eo1 )
    }

    "put everything together to create the whole table with DefaultWidth" in {
      meshDefault() should be ("+------------------------------+" + eo1
        + "|            +----+            |" + eo1
        + "|            |    |            |" + eo1
        + "|            |    |            |" + eo1
        + "|            +----+            |" + eo1
        + "|                              |" + eo1
        + "|                              |" + eo1
        + "|                              |" + eo1
        + "|                              |" + eo1
        + "|                              |" + eo1
        + "|            +----+            |" + eo1
        + "|            |    |            |" + eo1
        + "|            |    |            |" + eo1
        + "|            +----+            |" + eo1
        + "+------------------------------+" + eo1 )
    }
  }
}
