package com.dicoding.exam.exam2

// TODO 1
fun calculate(valueA: Int, valueB: Int, valueCcanNull: Int?): Int {
    val valueC = valueCcanNull ?: 50 // default value is 50
    return valueA + (valueB - valueC)
}

// TODO 2
fun result(result: Int): String {
    return "Result is $result" // showing the result from calculate()
}