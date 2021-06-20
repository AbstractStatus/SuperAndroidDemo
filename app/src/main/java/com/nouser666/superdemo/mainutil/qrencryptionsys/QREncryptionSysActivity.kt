package com.nouser666.superdemo.mainutil.qrencryptionsys

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.nouser666.superdemo.R
import com.nouser666.superdemo.base.BaseActivity
import com.nouser666.superdemo.mainutil.qrencryptionsys.fragment.DecryptionFragment
import com.nouser666.superdemo.mainutil.qrencryptionsys.fragment.EncryptionFragment
import com.nouser666.superdemo.mainutil.qrencryptionsys.fragment.KeyFragment

class QREncryptionSysActivity : BaseActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q_r_encryption_sys)


        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.view_pager2)

        //tab监听事件
//        tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
//            override fun onTabReselected(tab: TabLayout.Tab?) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {
//                TODO("Not yet implemented")
//            }
//
//            override fun onTabSelected(tab: TabLayout.Tab?) {
//                TODO("Not yet implemented")
//            }
//        })

        val fragment = ArrayList<Fragment>()
        fragment.add(KeyFragment())
        fragment.add(EncryptionFragment())
        fragment.add(DecryptionFragment())

        viewPager2.adapter = object : FragmentStateAdapter(this){
            override fun getItemCount(): Int {
                return fragment.size
            }

            override fun createFragment(position: Int): Fragment {
                return fragment[position]
            }

        }

        val tabLayoutMediator = TabLayoutMediator(tabLayout, viewPager2){ tab: TabLayout.Tab, position: Int ->
            when(position){
                0 -> tab.text = "配锁"
                1 -> tab.text = "加锁"
                2 -> tab.text = "解锁"
            }
        }

        tabLayoutMediator.attach()
    }
}