package com.nouser666.superdemo.maindemo

import com.nouser666.superdemo.main.MainEntity
import com.nouser666.superdemo.maindemo.personcard.PersonCardDemoActivity
import com.nouser666.superdemo.maindemo.personcard.PersonCardDemoInfo

class MainDemoInfo {
    companion object{
        private val list: ArrayList<MainEntity> = ArrayList()

        init {
            //个人名片
            list.add(MainEntity(PersonCardDemoInfo,
                    PersonCardDemoActivity::class.java))
        }

        fun getMainEntities(): List<MainEntity>{


            return list
        }
    }
}