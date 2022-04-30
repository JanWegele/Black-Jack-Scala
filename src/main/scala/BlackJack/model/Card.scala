package BlackJack
package model

import model.Ranks
import model.Suits


case class Card(suit: Suits.Suit, rank: Ranks.Rank) {
  override def toString: String = {
    val s = this.suit
    val r = this.rank
    s match
      case Suits.Spade => r match
        case Ranks.Ace => "\u1F0A1"
        case Ranks.Two => "\u1F0A2"
        case Ranks.Three => "\u1F0A3"
        case Ranks.Four => "\u1F0A4"
        case Ranks.Five => "\u1F0A5"
        case Ranks.Six => "\u1F0A6"
        case Ranks.Seven => "\u1F0A7"
        case Ranks.Eight => "\u1F0A8"
        case Ranks.Nine => "\u1F0A9"
        case Ranks.Ten => "\u1F0AA"
        case Ranks.Jack => "\u1F0AB"
        case Ranks.Queen => "\u1F0AD"
        case Ranks.King => "\u1F0AE"
        
      case Suits.Heart => r match
        case Ranks.Ace => "\u1F0B1"
        case Ranks.Two => "\u1F0B2"
        case Ranks.Three => "\u1F0B3"
        case Ranks.Four => "\u1F0B4"
        case Ranks.Five => "\u1F0B5"
        case Ranks.Six => "\u1F0B6"
        case Ranks.Seven => "\u1F0B7"
        case Ranks.Eight => "\u1F0B8"
        case Ranks.Nine => "\u1F0B9"
        case Ranks.Ten => "\u1F0BA"
        case Ranks.Jack => "\u1F0BB"
        case Ranks.Queen => "\u1F0BD"
        case Ranks.King => "\u1F0BE"

      case Suits.Diamond => r match
        case Ranks.Ace => "\u1F0C1"
        case Ranks.Two => "\u1F0C2"
        case Ranks.Three => "\u1F0C3"
        case Ranks.Four => "\u1F0C4"
        case Ranks.Five => "\u1F0C5"
        case Ranks.Six => "\u1F0C6"
        case Ranks.Seven => "\u1F0C7"
        case Ranks.Eight => "\u1F0C8"
        case Ranks.Nine => "\u1F0C9"
        case Ranks.Ten => "\u1F0CA"
        case Ranks.Jack => "\u1F0CB"
        case Ranks.Queen => "\u1F0CD"
        case Ranks.King => "\u1F0CE"

      case Suits.Club => r match
        case Ranks.Ace => "\u1F0D1"
        case Ranks.Two => "\u1F0D2"
        case Ranks.Three => "\u1F0D3"
        case Ranks.Four => "\u1F0D4"
        case Ranks.Five => "\u1F0D5"
        case Ranks.Six => "\u1F0D6"
        case Ranks.Seven => "\u1F0D7"
        case Ranks.Eight => "\u1F0D8"
        case Ranks.Nine => "\u1F0D9"
        case Ranks.Ten => "\u1F0DA"
        case Ranks.Jack => "\u1F0DB"
        case Ranks.Queen => "\u1F0DD"
        case Ranks.King => "\u1F0DE"
  }
}



