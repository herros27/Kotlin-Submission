package com.dicoding.exam.optionalexam4

import com.dicoding.exam.exam2.result

// TODO
fun getMiddleCharacters(string: String): String? {
    val length = string.length
    val result: String? =
        when(length){
            in 1..100 ->{
                if (length % 2 ==0){ // panjang genap
                    string.substring(length/ 2 - 1, length/2 + 1)
                }else{ // panjang ganjil
                    string.substring(length / 2, length / 2 +1)
                }
            }
        else ->null
        }
    return result
}