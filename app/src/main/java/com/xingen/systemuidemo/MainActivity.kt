package com.xingen.systemuidemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var tag = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        setSystemUIChangeListener()
        setGestureHandler()
    }

    /**
     * 初始化控件
     */
    fun initView() {
        main_stickyStyle.setOnClickListener(this)
        main_normalStyle.setOnClickListener(this)
        main_dimStyle.setOnClickListener(this)
        main_ImmersiveStyle.setOnClickListener(this)
        main_clearStyle.setOnClickListener { this }
    }

    /**
     * 监听System bar异步改变，来控制actionbar。
     */
    fun setSystemUIChangeListener() {
        /**
         * 当system bar 设置LOW_PROFILE, HIDE_NAVIGATION, or FULLSCREEN flags，会触发
         */
        window.decorView.setOnSystemUiVisibilityChangeListener {
            visibility ->
            if ((visibility and View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {// system bar可见
                //  SystemUIManager.setStickyStyle(window)
                Toast.makeText(applicationContext, " system bar 显示出来", Toast.LENGTH_SHORT).show()
            } else {// system bar不可见
                Toast.makeText(applicationContext, " system bar被隐藏", Toast.LENGTH_SHORT).show()
            }
        }
    }

    /**
     * 手势处理类
     */
    lateinit var gestureDetector: GestureDetector

    /**
     * 添加手势处理
     */
    fun setGestureHandler() {
        //创建一个 gestrue Dector来处理onTouch()中信息。
        gestureDetector = GestureDetector(this.applicationContext, object : GestureDetector.SimpleOnGestureListener() {
            override fun onSingleTapUp(e: MotionEvent): Boolean {
                Log.i(tag, "onSingleTapUp")
                return super.onSingleTapUp(e)
            }

            override fun onDown(e: MotionEvent): Boolean {
                Log.i(tag, " onDown ")
                return true
            }
        })
        gestureDetector.setIsLongpressEnabled(false)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        var result = gestureDetector.onTouchEvent(event)
        return result
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.main_normalStyle -> {
                SystemUIManager.setNormalStyle(window)
            }
            R.id.main_stickyStyle -> {
                SystemUIManager.setStickyStyle(window)
            }
            R.id.main_dimStyle -> {
                SystemUIManager.setDimStyle(window)
            }
            R.id.main_ImmersiveStyle -> {
                SystemUIManager.setImmersiveStyle(window)
            }
            R.id.main_clearStyle -> {
                SystemUIManager.clearStyle(window)
            }
        }
    }

    /**
     * 当焦点占据时候，隐藏system bar.
     */
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus) {
            //    SystemUIManager.setNormalStyle(window)
        }
        super.onWindowFocusChanged(hasFocus)
    }
}
