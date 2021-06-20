package com.nouser666.superdemo.util

class RandomUtil {

    companion object{
        fun getRandomIntByRangeInt(a: Int, b: Int, left: Boolean, right: Boolean): Int{
            return if (left){
                if (right){
                    (Math.random() * (b - a + 1) + a).toInt()
                } else{
                    (Math.random() * (b - a) + a).toInt()
                }
            } else{
                if(right){
                    (Math.random() * (b - a) + a + 1).toInt()
                } else{
                    (Math.random() * (b - a - 1) + a + 1).toInt()
                }
            }
        }
    }

}