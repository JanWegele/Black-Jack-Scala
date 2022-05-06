package BlackJack
package controller

import model.{CreateDeck, Scoreboard, Player}
import util.Observable


case class Controller(var scoreboard: Scoreboard) extends Observable :

  def doAndPublish(doThis: CreateDeck => Scoreboard, create: CreateDeck): Unit =
    scoreboard = doThis(create)
    notifyObservers()

  def put(create: CreateDeck) : String =
    scoreboard.printScoreboard()

  def createPlayer(name: String): Player = Player(name)

  override def toString : String = scoreboard.toString
