package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val numberRegex ="\\d+".toRegex()
    val matchResult = numberRegex.find(str)

    return if(matchResult!= null){
        val numberInStr = matchResult.value.toInt()
        val result = numberInStr * int

        str.replace(matchResult.value, result.toString())
    }else{
        str + int
    }

}
