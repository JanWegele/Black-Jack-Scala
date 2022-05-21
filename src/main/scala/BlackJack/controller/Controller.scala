package BlackJack
package controller

import BlackJack.model.*
import BlackJack.util.Observable

import scala.Option
import scala.collection.mutable.ListBuffer



case class Controller(var game: Game) extends Observable {

  def doAndPublish(doThis: Move => Game, create: Move): Unit =
    game = doThis(create)
    notifyObservers()

  def put(move: Move): Game = move.doStep(game)

  //  def createPlayer(name: String): Move =



//  def redo() : Unit

//  def undo() : Unit

  override def toString: String = game.toString
}

