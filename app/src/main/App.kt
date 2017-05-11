package org.dragosv.fizzbuzz

fun main(args : Array<String>) {
    var max = 1000

    if (args.size > 0) {
        max = args[0].toInt()
    }

    for (number in Numbers.getNumbers(max)) {
        var output = ""

        if (number.isFibonacci) {
            output = "Fizz"
        }

        if (number.isPrime) {
            output += "Buzz"
        }

        println(number.value.toString()  + ": " + output)
    }
}
