package com.xingen.systemuidemo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xingen.systemuidemo.R
import com.xingen.systemuidemo.SystemUIManager
import kotlinx.android.synthetic.main.activity_dimstyle.*

/**
 * Created by ${xingen} on 2017/8/23.
 *
 * 暗淡System bar风格
 *
 */

class DimStyleActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dimstyle)

        //执行暗淡风格
        SystemUIManager.setDimStyle(window)
        initView()
    }
    fun  initView(){
        recover_normal_btn.setOnClickListener { view ->
            //清空flag,恢复正常
            SystemUIManager.clearStyle(window)
        }
    }
}
