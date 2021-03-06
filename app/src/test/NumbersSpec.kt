package org.dragosv.fizzbuzz

import com.winterbe.expekt.should
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

                listOf(2, 3, 5, 7).should.equal(primes)
            }

            it("should have expected fibonacci") {
                val fibonaccis = numbers.filter { it.isFibonacci }.map { it.value }.toList()

                listOf(1,2, 3, 5, 8).should.equal(fibonaccis)
            }
        }
    }
})