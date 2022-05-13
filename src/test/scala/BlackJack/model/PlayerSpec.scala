package BlackJack
package model

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class PlayerSpec extends AnyWordSpec {
  val deckPlayer = Deck()
  val cardPlayer = Card(Suit.Spade, Rank.Queen)
  val player = Player("Bernhardt", 0, deckPlayer)
  "Player" should {
    "be able to change his score" in {
      player.changeScore(21) should be (21)
    }
    "have a name" in {
      player.name should be("Bernhardt")
    }
    "be able to add a Card to the top of the Deck" in {
      player.addToDeck(cardPlayer) should be (deckPlayer.addToTop(cardPlayer))
    }
  }
}