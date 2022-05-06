package BlackJack
package model

import scala.collection.mutable.ListBuffer
import BlackJack.aview.TUI

class Scoreboard(playerCount: Int) {
  val eol: String = sys.props("line.separator")
  var dealer = new Player("Dealer")
  var playerList = new ListBuffer[Player]


  def playerScore(): String = {
    val str = ""
    for (i <- 0 until playerCount) {
      str + playerList(i).toString + playerList(i).score + playerList(i).playerDeck.getDeckAsString + eol
    }
    str
  }

  def returnPlayerCount(): Int =
    this.playerCount

  def printScoreboard(): String = {
    "Spieler\tScore\tCards" + eol +
    "Dealer\t" + dealer.score + "\t\t" + dealer.playerDeck.getDeckAsString + eol +
    this.playerScore() +
    playerList.toString()
  }
}
