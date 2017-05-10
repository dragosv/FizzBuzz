package org.dragosv.fizzbuzz

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

class NumbersSpec : Spek({
    given("numbers") {
        on("retrieving first 10") {
            val numbers = Numbers.getNumbers(10)

            it("should have expected primes") {
                val primes = numbers.filter { it.isPrime }.map { it.value }.toList()

                assertEquals(listOf(1,2, 3, 5, 7), primes)
            }

            it("should have expected fibonaci") {
                val primes = numbers.filter { it.isFibonaci }.map { it.value }.toList()

                assertEquals(listOf(1,2, 3, 5, 8), primes)
            }
        }
    }
})