// Deric Buettner
// Functional Programming in Scala
// EX 2:1

object Fibonacci {
    // BigInt prevents integer overflow for large terms.
    var term1 = BigInt(0)
    var term2 = BigInt(1)

    private def fib(n: Int): BigInt = {
        @annotation.tailrec
        def go(i: Int, oldterm: BigInt, newterm: BigInt): BigInt =
            if (i <= 1) oldterm
            else  go(i-1, newterm, oldterm + newterm)

        go(n, term1, term2)
    }

    def main(args: Array[String]): Unit = {
        println(fib(1)) // 0
        println(fib(2)) // 1
        println(fib(3)) // 1
        println(fib(10)) // 34
        println(fib(100)) // 218922995834555169026
    }  
}
