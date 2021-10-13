package com.example.myapplication1

import android.R.attr
import java.util.function.Function
import java.util.stream.Collectors
import android.R.attr.text

import java.util.Arrays







class findCountWord {
    //функция нахождения слов из строки, и подсчет повторений слов
    fun countWord(str:String):Map<String,Int>
    {
        val words:List<String> = str.lowercase().split(":",",",".","?","!"," - "," ").filter { it!="" }
        val mapWord = words.groupingBy { it }.eachCount()
        return mapWord
    }

}
