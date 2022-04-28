package BlackJack.model

class Grid(playerCount: Int) {
  val eol: String = sys.props("line.separator")

  val totalWidth: Int = playerCount * 10 + 3
  val dealerGap: Int = (totalWidth - 7) / 2

  def space() = " "


  def border(): String = "+" + "-" * totalWidth + "+" + eol

  def emptyLine(): String = "|" + " " * totalWidth + "|" + eol

  def dealerBorder(): String = "|" + " " * dealerGap + "+" + "-----" + "+" + " " * dealerGap + "|" + eol

  def dealerBody(): String = "|" + " " * dealerGap + "|" + " " * 5 + "|" + " " * dealerGap + "|" + eol +
    "|" + " " * dealerGap + "|" + " " * 5 + "|" + " " * dealerGap + "|" + eol +
    "|" + " " * dealerGap + "|" + " " * 5 + "|" + " " * dealerGap + "|" + eol

  def playerBorder(): String = "|" + " " * 3 + ("+" + "-" * 5 + "+" + " " * 3) * playerCount + "|" + eol

  def playerBody(): String = "|" + " " * 3 + ("|" + " " * 5 + "|" + " " * 3) * playerCount + "|" + eol +
    "|" + " " * 3 + ("|" + " " * 5 + "|" + " " * 3) * playerCount + "|" + eol +
    "|" + " " * 3 + ("|" + " " * 5 + "|" + " " * 3) * playerCount + "|" + eol

  def render(): String = border() + emptyLine() + dealerBorder() + dealerBody() + dealerBorder() +
    emptyLine() * 2 + playerBorder() + playerBody() + playerBorder() + emptyLine() + border()
}
