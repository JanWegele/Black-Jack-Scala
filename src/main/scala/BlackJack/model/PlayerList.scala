package BlackJack
package model

import model.Player

case class PlayerList(playerList: List[Player] = List(Player("Dealer", 0, Deck.apply("empty")))) {

  def add(player : Player): PlayerList = this.copy(playerList = playerList :+ player)

  override def toString: String =
    var str : String = this.playerList.head.toString
    for(p <- this.playerList)
      str.concat(", " + p.toString)
    str
}

