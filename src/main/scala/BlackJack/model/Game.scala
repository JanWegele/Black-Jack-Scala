package BlackJack.model

import scala.collection.mutable.ListBuffer

case class Game(playerList: List[Player], gameDeck: Deck, playerTurn: Int, playerCount : Int) {

  def addDealer(): Game = copy(playerList = Player("Dealer", 0, Deck()) :: playerList)

  def addPlayer(name: String): Game = copy(playerList = Player(name, 0, Deck()) :: playerList)

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
