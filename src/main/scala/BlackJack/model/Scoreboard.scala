package BlackJack
package model

import scala.collection.mutable.ListBuffer
import BlackJack.aview.TUI

class Scoreboard(playerCount: Int) {
  val eol: String = sys.props("line.separator")
  var dealer = new Player("Dealer")
  var playerList = new ListBuffer[Player]


  def allPlayerScores(): String = {
    val str = playerList.head.playerScore()
    for (i <- 1 until this.playerCount) {
      str + playerList(i).playerScore()
    }
    str
  }

  def returnPlayerCount(): Int =
    this.playerCount

  def printScoreboard(): String = {
    println("Scoreboard: " + this.allPlayerScores())
    "Spieler\tScore\tCards" + eol +
    "Dealer\t" + dealer.score + "\t\t" + dealer.playerDeck.getDeckAsString + eol +
      this.allPlayerScores() +
    playerList.toString()
  }
}
