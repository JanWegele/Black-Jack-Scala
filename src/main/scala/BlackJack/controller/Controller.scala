package BlackJack
package controller

import model.Grid
import model.Field
import util.Observable


case class Controller(var field: Field) extends Observable:
  //val undoManager = new UndoManager[Field]
  //def doAndPublish(doThis: Move => Field, move: Move) =
  //  field = doThis(move)
  //  notifyObservers
  //def doAndPublish(doThis: => Field) =
  //  field = doThis
  //  notifyObservers
  //def put(move: Move): Field = undoManager.doStep(field, PutCommand(move))
  //def undo: Field = undoManager.undoStep(field)
  //def redo: Field = undoManager.redoStep(field)

  override def toString = field.toString