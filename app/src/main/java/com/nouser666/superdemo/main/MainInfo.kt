package com.nouser666.superdemo.main

import com.nouser666.superdemo.common.MainIntegerValue

interface MainInfo {
    //模块id
    fun getId(): String

    //模块名称
    fun getTitle(): String

    //模块最后更新时间
    fun getTime(): String

    //模块类型 参见MainIntegerValue类
    fun getType() : Int

    //模块简介
    fun getIntroduction() : String

    //模块扩展描述键值对
    fun getInfoMaps(): Map<String, String>
}