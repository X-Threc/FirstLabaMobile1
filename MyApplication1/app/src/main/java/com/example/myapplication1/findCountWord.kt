package com.example.myapplication1

import android.R.attr
import java.util.function.Function
import java.util.stream.Collectors
import android.R.attr.text

import java.util.Arrays



fun countWord(str:String):Map<String,Int>
{
    val buf:List<String> = str.lowercase().split(", ",". ","! ","? ","; "," - "," ")
    val fr = buf.groupingBy { it }.eachCount()
    return fr
}



class findCountWord {

}
