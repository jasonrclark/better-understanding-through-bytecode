fun main() {
  dontOverflow(0)
}

tailrec fun dontOverflow(n: Long) {
  dontOverflow(n + 1)
}
