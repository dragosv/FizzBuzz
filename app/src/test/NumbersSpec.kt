package org.dragosv.fizzbuzz

import org.amshove.kluent.shouldEqual
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class NumbersSpec : Spek({
    given("numbers") {
        on("retrieving first 10") {
            val numbers = Numbers.getNumbers(10)

            it("should have expected primes") {
                val primes = numbers.filter { it.isPrime }.map { it.value }.toList()

                listOf(2, 3, 5, 7) shouldEqual primes
            }

            it("should have expected fibonaci") {
                val fibonacis = numbers.filter { it.isFibonaci }.map { it.value }.toList()

                listOf(1,2, 3, 5, 8) shouldEqual fibonacis
            }
        }
    }
})