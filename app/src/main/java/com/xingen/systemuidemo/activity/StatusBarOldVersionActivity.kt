package com.xingen.systemuidemo.activity

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import com.xingen.systemuidemo.R

/**
 * Created by ${xingen} on 2017/8/23.
 *
 * 在4.0及其以下旧版本，隐藏StatusBar
 *
 */

class StatusBarOldVersionActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT<16){
            setSystemBarOnLowerVersion()
        }
        setContentView(R.layout.activity_statusbaroldversion)
    }
    /**
     * 在4.0 及其以下，设置StatusBar
     */
    fun setSystemBarOnLowerVersion(){
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

}
