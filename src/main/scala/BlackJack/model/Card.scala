package BlackJack
package model

enum Rank :
  case Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
end Rank

enum Suit :
  case Spade, Heart, Diamond, Club
end Suit

case class Card(suit: Suit, rank: Rank) {
  //  override def toString: String = {
  //    val s = this.suit
  //    val r = this.rank
  //    s match
  //      case Suit.Spade => r match
  //        case Rank.Ace => "\u1F0A1"
  //        case Rank.Two => "\u1F0A2"
  //        case Rank.Three => "\u1F0A3"
  //        case Rank.Four => "\u1F0A4"
  //        case Rank.Five => "\u1F0A5"
  //        case Rank.Six => "\u1F0A6"
  //        case Rank.Seven => "\u1F0A7"
  //        case Rank.Eight => "\u1F0A8"
  //        case Rank.Nine => "\u1F0A9"
  //        case Rank.Ten => "\u1F0AA"
  //        case Rank.Jack => "\u1F0AB"
  //        case Rank.Queen => "\u1F0AD"
  //        case Rank.King => "\u1F0AE"
  //
  //      case Suit.Heart => r match
  //        case Rank.Ace => "\u1F0B1"
  //        case Rank.Two => "\u1F0B2"
  //        case Rank.Three => "\u1F0B3"
  //        case Rank.Four => "\u1F0B4"
  //        case Rank.Five => "\u1F0B5"
  //        case Rank.Six => "\u1F0B6"
  //        case Rank.Seven => "\u1F0B7"
  //        case Rank.Eight => "\u1F0B8"
  //        case Rank.Nine => "\u1F0B9"
  //        case Rank.Ten => "\u1F0BA"
  //        case Rank.Jack => "\u1F0BB"
  //        case Rank.Queen => "\u1F0BD"
  //        case Rank.King => "\u1F0BE"
  //
  //      case Suit.Diamond => r match
  //        case Rank.Ace => "\u1F0C1"
  //        case Rank.Two => "\u1F0C2"
  //        case Rank.Three => "\u1F0C3"
  //        case Rank.Four => "\u1F0C4"
  //        case Rank.Five => "\u1F0C5"
  //        case Rank.Six => "\u1F0C6"
  //        case Rank.Seven => "\u1F0C7"
  //        case Rank.Eight => "\u1F0C8"
  //        case Rank.Nine => "\u1F0C9"
  //        case Rank.Ten => "\u1F0CA"
  //        case Rank.Jack => "\u1F0CB"
  //        case Rank.Queen => "\u1F0CD"
  //        case Rank.King => "\u1F0CE"
  //
  //      case Suit.Club => r match
  //        case Rank.Ace => "\u1F0D1"
  //        case Rank.Two => "\u1F0D2"
  //        case Rank.Three => "\u1F0D3"
  //        case Rank.Four => "\u1F0D4"
  //        case Rank.Five => "\u1F0D5"
  //        case Rank.Six => "\u1F0D6"
  //        case Rank.Seven => "\u1F0D7"
  //        case Rank.Eight => "\u1F0D8"
  //        case Rank.Nine => "\u1F0D9"
  //        case Rank.Ten => "\u1F0DA"
  //        case Rank.Jack => "\u1F0DB"
  //        case Rank.Queen => "\u1F0DD"
  //        case Rank.King => "\u1F0DE"
  //  }
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


