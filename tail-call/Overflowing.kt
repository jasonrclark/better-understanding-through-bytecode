@Suppress("UNUSED_PARAMETER")
fun main(args: Array<String>) {
  overflow(0)
}

fun overflow(i: Int) {
  overflow(i + 1)
}
