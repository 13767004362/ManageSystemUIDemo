package com.xingen.systemuidemo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.xingen.systemuidemo.R
import com.xingen.systemuidemo.SystemUIManager
import kotlinx.android.synthetic.main.activity_statusbarnewversion.*

/**
 * Created by ${xingen} on 2017/8/23.
 *
 * Android 4.1及其以上版本控制StatusBar
 */
class StatusBarNewVersionActivity:AppCompatActivity() ,View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statusbarnewversion)
        initView()
    }
    fun initView(){
        normal_hide_status_bar.setOnClickListener { this }
        float_hide_status_bar.setOnClickListener { this }
    }
    override fun onClick(view: View) {
        when(view.id){
            R.id.normal_hide_status_bar->{
                SystemUIManager.setStatusNormalStyle(window)
            }
            R.id.float_hide_status_bar->{
                SystemUIManager.setStatusFloatStyle(window)
            }
        }
    }
}