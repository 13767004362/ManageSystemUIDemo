package com.xingen.systemuidemo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.xingen.systemuidemo.R
import com.xingen.systemuidemo.SystemUIManager
import kotlinx.android.synthetic.main.activity_navigationbar.*

/**
 * Created by ${xingen} on 2017/8/23.
 *
 * Navigation bar 的隐藏
 */

class NavigationBarActivity :AppCompatActivity() ,View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigationbar)
        initView()
    }
    fun  initView(){
        normal_hide_navigation_bar.setOnClickListener ( this )
        float_hide_navigation_bar.setOnClickListener (this )
    }

    override fun onClick(view: View) {
       when(view.id){
           R.id.normal_hide_navigation_bar->{
               SystemUIManager.setNavigationBarNormalStyle(window)
           }
           R.id.float_hide_navigation_bar->{
               SystemUIManager.setNavigationBarFloatStyle(window)
           }
       }
    }
}
