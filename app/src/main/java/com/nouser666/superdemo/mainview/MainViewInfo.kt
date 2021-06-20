package com.nouser666.superdemo.mainview

import com.nouser666.superdemo.main.MainEntity
import com.nouser666.superdemo.mainview.rotatevecview.RotateVecViewActivity
import com.nouser666.superdemo.mainview.rotatevecview.RotateVecViewInfo

class MainViewInfo {
    companion object{
        private val list: ArrayList<MainEntity> = ArrayList()

        init {
            list.add(
                    //旋转矢量
                MainEntity(RotateVecViewInfo,
                        RotateVecViewActivity::class.java)
            )
        }

        fun getMainEntities(): List<MainEntity>{


            return list
        }
    }
}