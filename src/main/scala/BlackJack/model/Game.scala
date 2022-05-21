package BlackJack
package model

import org.xml.sax.ext.DeclHandler
import model.Deck
import model.PlayerList

//Facade Patterm
case class Game(playerList: PlayerList, gameDeck: Deck, playerCount: Int, playerTurn : Int):

  def addDealer(): Game = this.copy(playerList = playerList.add(Player("Dealer", 0, Deck.apply("empty"))))

  def addPlayer(playerName: String): Game = this.copy(playerList = playerList.add(Player(playerName, 0, Deck.apply("empty"))))

//  def addToTop(card: Card, player: Player): Game =
//    this.copy(
//      playerList.updated(playerList.indexOf(player),
//        Player(playerList(playerList.indexOf(player)).name,
//          playerList(playerList.indexOf(player)).playerScore,
//          playerList(playerList.indexOf(player)).playerDeck.addToTop(card)
//        )
//      )
//    )

  //  def drawCard(player: Player): Game = {
  //    this.copy(
  //      playerList = this.playerList.updated(playerList.indexOf(player),
  //        this.playerList(playerList.indexOf(player)).copy(playerDeck = new Deck().addToTop(this.gameDeck.cards.head))),
  //      gameDeck = this.gameDeck.copy(this.gameDeck.cards.tail))
  //  }

//  def allPlayerScores(): String =
//    val eol: String = sys.props("line.separator")
//    var str: String = playerList.head.toString
//    for (player <- playerList.tail) {
//      str.concat("," + player.toString)
//    str


  override def toString: String = " "
//    val eol: String = sys.props("line.separator")
//    val finalString: String = this.playerList.head.toString + eol
//    for(p <- this.)

//  object PlayerList {
//    def create(playerCount : Int): List[Player] =
//      val playerList = List[Player]()
//      for (i <- 1 to playerCount)
//        playerList.updated(i-1, Player("player", 0, Deck.apply("empty")))
//      playerList
//  }