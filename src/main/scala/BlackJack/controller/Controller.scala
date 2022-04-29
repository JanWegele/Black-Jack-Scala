package BlackJack
package controller

import model.Grid
import util.Observable

case class Controller(var grid: Grid) extends Observable :

  def createPlayerCountGrid(playerCount : Int) : Unit =
    grid = new Grid(playerCount)
    notifyObservers()


  override def toString : String = grid.toString
