package com.dicoding.exam.optionalexam2

import com.dicoding.exam.exam1.result

// TODO
fun minAndMax(number: Int): Int {
    val digits = number.toString().map { it.toString().toInt() }

    val digitsMin = digits.min()
    val digitsMax = digits.max()

    val result = digitsMin + digitsMax
    return result
}
