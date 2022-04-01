@main def hello(): Unit =
  println("Hello world!")
  println(mesh)

val eo1 = sys.props("line.separator")
def bar(cellWidth: Int = 3, cellNum: Int = 3) =
  ("-" * cellWidth) * cellNum + "+" + eo1
val cells = "|   |   |   |" + eo1
val mesh = (bar() + cells) * 2 + bar


