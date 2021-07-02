package com.nouser666.superdemo.mainview

import com.nouser666.superdemo.main.MainEntity
import com.nouser666.superdemo.mainview.rotatevecview.RotateVecViewActivity
import com.nouser666.superdemo.mainview.rotatevecview.RotateVecViewInfo
import com.nouser666.superdemo.mainview.simplewebview.SimpleWebViewActivity
import com.nouser666.superdemo.mainview.simplewebview.SimpleWebViewInfo
import com.nouser666.superdemo.mainview.surfaceview.SurfaceViewActivity
import com.nouser666.superdemo.mainview.surfaceview.SurfaceViewInfo

class MainViewInfo {
    companion object{
        private val list: ArrayList<MainEntity> = ArrayList()

        init {
            list.add(
                    //旋转矢量
                MainEntity(RotateVecViewInfo,
                        RotateVecViewActivity::class.java)
            )
            list.add(
                    //简单web view
                    MainEntity(SimpleWebViewInfo,
                    SimpleWebViewActivity::class.java))

            list.add(
                    //surfaceView
                    MainEntity(SurfaceViewInfo,
                    SurfaceViewActivity::class.java)
            )
        }

        fun getMainEntities(): List<MainEntity>{


            return list
        }
    }
}