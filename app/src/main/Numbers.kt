package org.dragosv.fizzbuzz

object Numbers {
    fun getNumbers(max: Int) : List<Number> {
        val list: MutableList<Number> = mutableListOf()
        var fibonacciFirst = 1
        var fibonacciSecond = 2

        list.add(Number(0, false, false))
        list.add(Number(1, true, false))
        list.add(Number(2, true, true))

        val primes = mutableListOf(2)

        for (i in 3..max) {
            var isFibonacci = false
            var isPrime = false

            if (fibonacciFirst + fibonacciSecond == i) {
                fibonacciFirst = fibonacciSecond
                fibonacciSecond = i

                isFibonacci = true
            }

            if (isPrimeNumber(primes, i)) {
                primes.add(i)

                isPrime = true
            }

            list.add(Number(i, isFibonacci, isPrime))
        }

        return list
    }

    private fun isPrimeNumber(primes: List<Int>, number: Int) : Boolean {
        for (prime in primes) {
            if (number % prime == 0) {
                return false;
            }
        }

        return true;
    }
}