fun simpleFactorial(n: Long): Long {
  return if (n <= 0) {
    1
  } else {
    n * simpleFactorial(n - 1)
  }
}


fun tailrecFactorial(n: Long): Long {
  return if (n <= 0) {
    1
  } else {
    helpFact(n, 1)
  }
}

tailrec fun helpFact(i: Long, j: Long): Long {
  return if (i == 0L) {
    j
  } else {
    helpFact(i - 1, i * j)
  }
}
