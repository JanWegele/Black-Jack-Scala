package BlackJack
package model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers.*

class CardSpec extends AnyWordSpec {
  val card: Card = Card(Suit.Heart, Rank.Ace)
  "card" should {
    "return card as string" in {
      card.toString should be (card.suit.toString + card.rank.toString)
    }
  }
}
