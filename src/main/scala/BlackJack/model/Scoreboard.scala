package BlackJack
package model

import scala.collection.mutable.ListBuffer

class Scoreboard(playerCount: Int) {
  val eol : String = sys.props("line.separator")
  var dealer = new Player("Dealer")
  var playerList = new ListBuffer[Player]
  var str : String = ""

  def playerScore() : String = {
  for (player<-playerList) {
    str.concat(player.toString + player.score + player.playerDeck.getDeckAsString + eol)
    }
  str
  }

  def returnPlayerCount() : Int =
    this.playerCount

  def printScoreboard(): String = {
    "Spieler\tScore\tCards" + eol +
    "Dealer\t" + dealer.score + "\t\t" + dealer.playerDeck.getDeckAsString + eol
    for(player<-playerList) {
      player.toString + "\t" + player.score + player.playerDeck.getDeckAsString + eol
    }
//    playerList.(player => {
//      println(player.toString + "\t" + player.score + player.playerDeck.getDeckAsString + eol)
//    })
  }
}
