// Deric Buettner
// Functional Programming in Scala
// EX 2:2

object ArraySorter {
    val trueArray = Array(1, 2, 3, 4, 5)
    val falseArray = Array(9, 1)

    private def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
        @annotation.tailrec
        def go(n: Int): Boolean =
            if (n >= as.length - 1) true
            else if (!(ordered(as(n), as(n + 1)))) false
            else go(n + 1)

        go(0)
    }

    private def ascendingOrder(old: Int, next: Int): Boolean = {
        if (old > next) false
        else true
    }

    def main(args: Array[String]): Unit = {
        println(isSorted(trueArray, ascendingOrder)) // true
        println(isSorted(falseArray, ascendingOrder)) // false
    }
}