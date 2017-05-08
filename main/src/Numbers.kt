package org.dragosv.fizzbuzz

object Numbers {
    fun getNumbers(max: Int) : List<Number> {
        val list: MutableList<Number> = mutableListOf()
        var fibonaciFirst = 1
        var fibonaciSecond = 2

        list.add(Number(1, true, true))
        list.add(Number(2, true, true))

        val primes = mutableListOf(2)

        for (i in 3..max) {
            var isFibonaci = false
            var isPrime = false

            if (fibonaciFirst + fibonaciSecond == i) {
                fibonaciFirst = fibonaciSecond
                fibonaciSecond = i

                isFibonaci = true
            }

            if (isPrimeNumber(primes, i)) {
                primes.add(i)

                isPrime = true
            }

            list.add(Number(i, isFibonaci, isPrime))
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