package BlackJack
package model

import org.xml.sax.ext.DeclHandler


case class Game(playerList: List[Player], gameDeck: Deck, playerTurn: Int, playerCount: Int) {

  def addDealer() : Game = this.copy(playerList = List(Player("Dealer", 0, Deck())))

  def addPlayer(playerName : String) : Game = this.copy(playerList = playerList :+ Player(playerName, 0 , Deck()))

  def addToTop(card: Card, player: Player): Game = {
    this.copy(
      playerList.updated(playerList.indexOf(player),
        Player(playerList(playerList.indexOf(player)).name,
          playerList(playerList.indexOf(player)).playerScore,
          playerList(playerList.indexOf(player)).playerDeck.addToTop(card)
        )
      )
    )
  }

  def drawCard(player: Player): Game = {
    this.copy(
      playerList = this.playerList.updated(playerList.indexOf(player),
        this.playerList(playerList.indexOf(player)).copy(playerDeck = Deck(this.playerList(playerList.indexOf(player)).playerDeck.cards).addToTop(this.gameDeck.cards.head))),
      gameDeck = this.gameDeck.copy(this.gameDeck.cards.tail))
  }

  def allPlayerScores(): String = {
//    val eol: String = sys.props("line.separator")
    var str: String = playerList.head.toString
    for (player <- playerList.tail) {
      str = str.concat("," + player.toString)
    }
    str
  }

  def printScoreboard(): Unit = {
    val eol: String = sys.props("line.separator")
    println("Scoreboard:" + eol +
      "Spieler\tScore\tCards" + eol +
      allPlayerScores())
  }

}
