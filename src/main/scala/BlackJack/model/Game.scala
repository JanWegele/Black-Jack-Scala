package BlackJack.model

case class Game(scoreboard: Scoreboard, playerList : List[Player], gameDeck : Deck, playerTurn : Int) {
  def addPlayer( name:String ):Game = copy( playerList = Player( name, Deck(), 0 ) :: playerList )
}
