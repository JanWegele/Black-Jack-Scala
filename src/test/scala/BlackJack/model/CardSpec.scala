package BlackJack
package model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers.*

class CardSpec extends AnyWordSpec {
  val card: Card = Card(Suit.Diamond, Rank.Ten)
  "card" should {
    "return card value as string" in {
      card.toString should be ("♦10")
    }
  }
}
