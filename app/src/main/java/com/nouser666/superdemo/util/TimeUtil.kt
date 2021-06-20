package com.nouser666.superdemo.util

class TimeUtil {
    companion object{
        fun getTimeMilliSecondStr(): String{
            return System.currentTimeMillis().toString()
        }

        fun getTimeMillisecondLong(): Long{
            return System.currentTimeMillis()
        }
    }
}