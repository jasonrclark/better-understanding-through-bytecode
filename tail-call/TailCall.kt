fun main() {
  dontOverflow(0)
}

tailrec fun dontOverflow(i: Int) {
  dontOverflow(i + 1)
}
