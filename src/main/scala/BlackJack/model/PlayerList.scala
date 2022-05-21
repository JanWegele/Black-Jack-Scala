package BlackJack
package model

import model.Player

case class PlayerList(playerList: List[Player] = Nil) {

  def add(player : Player): PlayerList = this.copy(playerList = playerList.updated(playerList.length, player))
}

