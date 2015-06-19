// Deric Buettner
// Functional Programming in Scala
// EX 2:1

object Fibonacci {

    private def fib(n: Int): Int = {
        @annotation.tailrec
        var term1 = 0
        var term2 = 1
        def go(i: Int, oldterm: Int, newterm: Int): Int =
            if (i <= 1) oldterm
            else  go(i-1, newterm, oldterm + newterm)

        go(n, term1, term2)
    }

    def main(args: Array[String]): Unit = {
        println(fib(10))
    }  
}
