package BlackJack
package model

trait Move {
  def doStep( game:Game ):Game
}

case class CreatePlayer(playerName:String ) extends Move {
  override def doStep(game: Game): Game = game.addPlayer( playerName )
}

//case class DrawCard() extends Move{
//  override def doStep(game: Game): Game =
//}
