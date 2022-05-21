package BlackJack
package model

import org.scalatest.matchers.should.Matchers.*
import org.scalatest.wordspec.AnyWordSpec

import scala.collection.mutable.ListBuffer

class GameSpec extends AnyWordSpec {
  val p1: Player = Player("Max", 0, Deck.apply("empty"))
  val p2: Player = Player("Tim", 0, Deck.apply("empty"))
  val playerList : PlayerList = PlayerList.apply().add(p1).add(p2)
  val game: Game = Game (playerList, Deck.apply("filled"), 0, 2)


  "game" should {
    "add a player to the game" in {
      game.addPlayer("Tom").playerList.playerList.toString() should be ("List(Dealer, Max, Tim, Tom)")
    }
//    "add card to top of a playerdeck" in {
//      game.addToTop(Card(Suit.Heart, Rank.Ace),p1).playerList(playerList.indexOf(p1)).playerDeck.head should be (Card(Suit.Heart, Rank.Ace))
//    }
//    "draw a card from gamedeck" in {
//      game.drawCard(p1).playerList(playerList.indexOf(p1)).playerDeck.cards.last should be (game.gameDeck.cards.head)
//    }
//    "return playerscores" in {
//      game.allPlayerScores() should be ("Max,Tim")
//    }
  }
}
