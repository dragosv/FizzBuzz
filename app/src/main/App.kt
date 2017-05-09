package main

import java.lang.Integer.parseInt

fun main(args : Array<String>) {
    var max = 1000

    if (args.size > 0) {
        max = parseInt(args[0])
    }

    for (number in Numbers.getNumbers(max)) {
        var output = ""

        if (number.isFibonaci) {
            output = "Fizz"
        }

        if (number.isPrime) {
            output += "Buzz"
        }

        println(number.value.toString()  + ": " + output)
    }
}


