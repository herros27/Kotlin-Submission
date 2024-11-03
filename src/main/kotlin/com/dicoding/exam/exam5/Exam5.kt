package com.dicoding.exam.exam5

import com.dicoding.exam.exam1.result
import kotlinx.coroutines.delay

// TODO 1
suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3000L)
    val result = valueA + valueB
    return result
}

// TODO 2
suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(2000L)
    val result = valueA * valueB
    return result
}
