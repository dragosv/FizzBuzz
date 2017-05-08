package org.dragosv.fizzbuzz

import java.lang.Integer.parseInt

fun main(args : Array<String>) {
    var max = 1000

    if (args.size > 0) {
        max = parseInt(args[0])
    }

    var fibonaciFirst = 1
    var fibonaciSecond = 2

    println("1: FizzBuzz")
    println("2: FizzBuzz")

    val primes = mutableListOf(2)

    for (i in 3..max) {
        var output = ""

        if (fibonaciFirst + fibonaciSecond == i) {
            fibonaciFirst = fibonaciSecond
            fibonaciSecond = i

            output = "Fizz"
        }

        if (isPrimeNumber(primes, i)) {
            primes.add(i)

            output += "Buzz"
        }

        println(i.toString()  + ": " + output)
    }
}

fun isPrimeNumber(primes: List<Int>, number: Int) : Boolean {
    for (prime in primes) {
        if (number % prime == 0) {
            return false;
        }
    }

    return true;
}
