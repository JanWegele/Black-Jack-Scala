package BlackJack
package controller

import model.Grid
import util.Observable

case class Controller(var grid: Grid) extends Observable :


  override def toString : String = grid.toString
