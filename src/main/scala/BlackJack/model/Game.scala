package BlackJack.model

import scala.collection.mutable.ListBuffer

case class Game(playerList: ListBuffer[Player], gameDeck: Deck, playerTurn: Int, playerCount : Int) {

  def addDealer(): Game = this.copy(playerList.addOne(Player("Dealer", 0, Deck(ListBuffer[Card]()))))

  def addPlayer(name: String): Game = this.copy(playerList.addOne(Player(name, 0, Deck(ListBuffer[Card]()))))

  def allPlayerScores(): String = {
    val eol: String = sys.props("line.separator")
    val str : String = ""
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
