package BlackJack
package controller

import model.{CreateDeck, Grid, Player}
import util.Observable


case class Controller(var grid: Grid) extends Observable :

  def doAndPublish(doThis: CreateDeck => Grid, create: CreateDeck): Unit =
    grid = doThis(create)
    notifyObservers()

  def put(create: CreateDeck) : String =
    grid.render()

  def createPlayer(name: String): Unit =
    val p = new Player(name, 0)

  override def toString : String = grid.toString
