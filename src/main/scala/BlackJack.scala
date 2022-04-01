@main def hello(): Unit =
  println("Hello world!")
  println(mesh)

val eo1: String = sys.props("line.separator")

def barTop(cellWidth: Int = 60): String =
  ("_" * cellWidth) + eo1
def barBottom(cellWidth: Int = 60): String =
  ("¯" * cellWidth) + eo1
def space() = " "
def cardMidTop(): String =
  ("|" + space() * 26 + "|" + space() + "|" + "/" + space() + "|" + space() * 26 + "|")
def cardMidBottom(): String =
  ("|" + space() * 26 + "|" + space() + "|" + "\\" + space() + "|" + space() * 26 + "|")
def card(): String =
  ("|" + space() * 26 + "______" + space() * 26 + "|" + eo1 + cardMidTop() + eo1 + cardMidBottom() + eo1 +
  "|" + space() * 26 + "¯¯¯¯¯¯" + space() * 26 + "|" + eo1)
val cells: String = "|                                                          |" + eo1
val mesh: String = barTop() + card() + cells + cells + card() + barBottom()
