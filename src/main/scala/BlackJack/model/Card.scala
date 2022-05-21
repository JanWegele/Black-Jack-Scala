package BlackJack
package model

enum Rank(display: String):
  case Two extends Rank("2")
  case Three extends Rank("3")
  case Four extends Rank("4")
  case Five extends Rank("5")
  case Six extends Rank("6")
  case Seven extends Rank("7")
  case Eight extends Rank("8")
  case Nine extends Rank("9")
  case Ten extends Rank("10")
  case Jack extends Rank("J")
  case Queen extends Rank("Q")
  case King extends Rank("K")
  case Ace extends Rank("A")

  override def toString: String = display
end Rank

enum Suit(display: String):
  case Spade extends Suit("♠")
  case Heart extends Suit("♥")
  case Diamond extends Suit("♦")
  case Club extends Suit("♣")

  override def toString: String = display
end Suit

//Bridge-Pattern?????

case class Card(suit: Suit, rank: Rank) {

  val s: Suit = this.suit
  val r: Rank = this.rank

  override def toString: String = s.toString + r.toString
}

