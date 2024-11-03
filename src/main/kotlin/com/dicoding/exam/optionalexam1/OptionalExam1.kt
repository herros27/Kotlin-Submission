package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    val sortNumbDesc = numbers.sortedDescending().take(3)
    val result = sortNumbDesc.sum()
    return result
}
