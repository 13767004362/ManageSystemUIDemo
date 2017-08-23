package com.xingen.systemuidemo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xingen.systemuidemo.R
import com.xingen.systemuidemo.SystemUIManager

/**
 * Created by ${xingen} on 2017/8/23.
 *
 * android 4.4 immerive效果，触摸屏幕，System bar浮现
 */
class ImmersiveStyleActivity  :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_immerivestyle)
        //设置ImmersiveStyle
        SystemUIManager.setImmersiveStyle(window)
    }
}