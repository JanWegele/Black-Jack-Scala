package BlackJack
package controller

import model.Grid
import util.Observable

case class Controller(var grid: Grid) extends Observable :

  def createPlayerCountGrid(playercount : Int) : Unit =
    grid = new Grid(playercount)
    notifyObservers()


  override def toString : String = grid.toString
