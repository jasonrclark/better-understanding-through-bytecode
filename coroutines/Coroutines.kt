import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
  GlobalScope.launch {
    first()
    second()
    third()
  }

  // Give time to finish without bringing other coroutine baggage to main
  Thread.sleep(1000)
}

suspend fun first() {
  println("first")
}

suspend fun second() {
  println("second")
}

suspend fun third() {
  println("third")
}
