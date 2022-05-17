package BlackJack
package model

import org.xml.sax.ext.DeclHandler


case class Game(playerList: List[Player], gameDeck: Deck, playerTurn: Int, playerCount: Int) {

  def createPlayerList() : Game = {
    val playerList : List[Player] = List.fill(playerCount + 1)(Player("p", 0, Deck()))
    playerList.updated(0, Player("Dealer", 0, Deck(List[Card]())))
    this.copy(playerList = playerList)
  }

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
    val index = playerList.indexOf(player)
    val topCard = this.gameDeck.cards.head
    val oldPlayerDeck = Deck(this.playerList(index).playerDeck.cards)
    val updatedPlayer = this.playerList(index).copy(playerDeck = oldPlayerDeck.addToTop(topCard))
    this.copy(playerList = this.playerList.updated(index, updatedPlayer),
      gameDeck = this.gameDeck.copy(this.gameDeck.cards.tail))
  }

  def allPlayerScores(): String = {
    val eol: String = sys.props("line.separator")
    val str: String = ""
    for (player <- playerList) {
      str.concat(player.toString + eol)
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
