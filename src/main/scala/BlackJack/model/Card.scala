package BlackJack
package model

enum Rank :
  case Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
end Rank

enum Suit :
  case Spade, Heart, Diamond, Club
end Suit

case class Card(suit: Suit, rank: Rank) {
  override def toString: String = {
    val s = this.suit
    val r = this.rank
    s match
      case Suit.Spade => r match
        case Rank.Ace => "♠A"
        case Rank.Two => "♠2"
        case Rank.Three => "♠3"
        case Rank.Four => "♠4"
        case Rank.Five => "♠5"
        case Rank.Six => "♠6"
        case Rank.Seven => "♠7"
        case Rank.Eight => "♠8"
        case Rank.Nine => "♠9"
        case Rank.Ten => "♠10"
        case Rank.Jack => "♠J"
        case Rank.Queen => "♠Q"
        case Rank.King => "♠K"

      case Suit.Heart => r match
        case Rank.Ace => "♥A"
        case Rank.Two => "♥2"
        case Rank.Three => "♥3"
        case Rank.Four => "♥4"
        case Rank.Five => "♥5"
        case Rank.Six => "♥6"
        case Rank.Seven => "♥7"
        case Rank.Eight => "♥8"
        case Rank.Nine => "♥9"
        case Rank.Ten => "♥10"
        case Rank.Jack => "♥J"
        case Rank.Queen => "♥Q"
        case Rank.King => "♥K"

      case Suit.Diamond => r match
        case Rank.Ace => "♦A"
        case Rank.Two => "♦2"
        case Rank.Three => "♦3"
        case Rank.Four => "♦4"
        case Rank.Five => "♦5"
        case Rank.Six => "♦6"
        case Rank.Seven => "♦7"
        case Rank.Eight => "♦8"
        case Rank.Nine => "♦9"
        case Rank.Ten => "♦10"
        case Rank.Jack => "♦J"
        case Rank.Queen => "♦Q"
        case Rank.King => "♦K"

      case Suit.Club => r match
        case Rank.Ace => "♣A"
        case Rank.Two => "♣2"
        case Rank.Three => "♣3"
        case Rank.Four => "♣4"
        case Rank.Five => "♣5"
        case Rank.Six => "♣6"
        case Rank.Seven => "♣7"
        case Rank.Eight => "♣8"
        case Rank.Nine => "♣9"
        case Rank.Ten => "♣10"
        case Rank.Jack => "♣J"
        case Rank.Queen => "♣Q"
        case Rank.King => "♣K"
  }
}


