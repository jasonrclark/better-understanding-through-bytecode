@Suppress("UNUSED_PARAMETER")
fun main(args: Array<String>) {
  dontOverflow(0)
}

tailrec fun dontOverflow(i: Int) {
  dontOverflow(i + 1)
}
