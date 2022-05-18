package BlackJack
package model

import scala.collection.mutable.ListBuffer
import org.scalatest.matchers.should.Matchers.*
import org.scalatest.wordspec.AnyWordSpec

class GameSpec extends AnyWordSpec {
  val p1: Player = Player("Max", 0, Deck(List[Card]()))
  val p2: Player = Player("Tim", 0, Deck(List[Card]()))
  val playerList: List[Player] = List[Player](p1, p2)
  val game: Game = Game (playerList, gameDeck = Deck.apply(), 0, 2)


  "game" should {
    "add the dealer to the game" in {
      game.addDealer().playerList.toString() should be ("List(Dealer)")
    }
    "add a player to the game" in {
      game.addPlayer("Tom").playerList.toString() should be ("List(Max, Tim, Tom)")
    }
    "add card to top of a playerdeck" in {
      game.addToTop(Card(Suit.Heart, Rank.Ace),p1).playerList(playerList.indexOf(p1)).playerDeck.cards.head should be (Card(Suit.Heart, Rank.Ace))
    }
    "draw a card from gamedeck" in {
      game.drawCard(p1).playerList(playerList.indexOf(p1)).playerDeck.cards.last should be (game.gameDeck.cards.head)
    }
    "return playerscores" in {
      game.allPlayerScores() should be ("Max,Tim")
    }
  }
}
