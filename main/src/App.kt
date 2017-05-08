package org.dragosv.fizzbuzz

fun main(args : Array<String>) {
    val max = 1000;

    var fibonaciFirst: Int = 1;
    var fibonaciSecond: Int = 2;

    println("1: FizzBuzz");
    println("2: FizzBuzz");

    var output: String;
    var primes: MutableList<Int> = mutableListOf(2)

    var isPrime = false;
    var isFibonaci = false;

    for (i in 3..max) {
        output = "";

        if (fibonaciFirst + fibonaciSecond == i) {
            fibonaciFirst = fibonaciSecond;
            fibonaciSecond = i;

            output = "Fizz";
        }

        if (isPrimeNumber(primes, i)) {
            primes.add(i);

            output += "Buzz";
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


fun next(fibonaciFirst: Int, fibonaciSecond: Int, number: Int, max: Int)  {
    if (number == max) return;

    var newFibonaciFirst: Int;
    var newFibonaciSecond: Int;

    if (fibonaciFirst + fibonaciSecond == number) {
        newFibonaciFirst = fibonaciSecond;
        newFibonaciSecond = number;
    } else {
        newFibonaciFirst = fibonaciFirst;
        newFibonaciSecond = fibonaciSecond;
    }

    next(newFibonaciFirst, newFibonaciSecond, number + 1, max);
}

