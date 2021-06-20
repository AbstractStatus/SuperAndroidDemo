package com.nouser666.superdemo.main

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.nouser666.superdemo.R

class MainListAdapter(private val mainEntityList: List<MainEntity>,
                      private val activity: Activity)
    : RecyclerView.Adapter<MainListAdapter.MainListViewHolder>() {
    inner class MainListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //模块名称
        val titleText : TextView = itemView.findViewById(R.id.item_main_title)
        //模块最近更新时间
        val timeText : TextView = itemView.findViewById(R.id.item_main_time)
        //模块的列表按钮
        val container : ConstraintLayout = itemView.findViewById(R.id.item_main_container)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        return MainListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mainEntityList.size
    }

    override fun onBindViewHolder(holder: MainListViewHolder, position: Int) {
        val mainEntity: MainEntity = mainEntityList[position]

        /**
         * 用于搜素功能
         */
        holder.itemView.visibility = View.VISIBLE

        if(!mainEntity.visible){
            holder.itemView.visibility = View.GONE
            return
        }

        holder.titleText.text = mainEntity.info.getTitle()
        holder.timeText.text = mainEntity.info.getTime()
        holder.container.setOnClickListener {
            activity.startActivity(Intent(activity, mainEntity.activity))
        }

        holder.container.setOnLongClickListener{
            MainOnlyTextActivity.startActivity(activity, mainEntity.info.getTitle(), mainEntity.info.getIntroduction())
        }
    }


}