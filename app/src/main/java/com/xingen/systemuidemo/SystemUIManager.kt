package com.xingen.systemuidemo

import android.view.View
import android.view.Window

/**
 * Created by ${xingen} on 2017/7/27.
 *
 * 管理系统UI,显示与隐藏NavigationBar 和StatusBar
 */
object SystemUIManager {
    /**
     * 隐藏NavigationBar
     */
    var action_navigation_bar_hide = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION

    /**
     * 全屏，会隐藏StatusBar
     */
    var action_full_screen = View.SYSTEM_UI_FLAG_FULLSCREEN
    /**
     * 系统4.1或者更高版本，可以让NavigationBar和StatusBar浮在内容上面。
     */
    var action_navigation_bar_hide_float = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
    /**
     * 与SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION结合使用，确保布局稳定
     */
    var action_stable = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
    /**
     * 在系统4.0，API14以上使StatusBar和NavigationBar暗淡显示。
     */
    var action_dim = View.SYSTEM_UI_FLAG_LOW_PROFILE
    /**
     * 系统4.4 出现，该flag可以让程序进入全屏。
     */
    var action_immersive = View.SYSTEM_UI_FLAG_IMMERSIVE
    /**
     * 系统4.4 出现，该flag可以让系统bar出现，但是一会儿自动消失。Sticky方式
     */
    var action_immersive_sticky = View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY

    /**
     * Sticky风格
     */
    fun setStickyStyle(window: Window) {
        var flag = action_navigation_bar_hide or action_full_screen or action_navigation_bar_hide_float or action_navigation_bar_hide_float or action_stable or action_immersive_sticky
        window.decorView.systemUiVisibility = flag
    }
    /**
     * Immersive风格
     */
    fun setImmersiveStyle(window: Window) {
        var flag = action_navigation_bar_hide or action_full_screen or action_navigation_bar_hide_float or action_navigation_bar_hide_float or action_stable or action_immersive
        window.decorView.systemUiVisibility = flag
    }
    /**
     * 正常风格
     */
    fun setNormalStyle(window: Window) {
        var flag = action_navigation_bar_hide or action_full_screen
        window.decorView.systemUiVisibility = flag
    }

    /**
     * 暗淡风格
     */
    fun setDimStyle(window: Window) {
        var flag = action_dim
        window.decorView.systemUiVisibility = flag
    }

    /**
     * 清空全部flag ，恢复初始状态
     */
    fun clearStyle(window: Window) {
        //传递0值清空全部flags。
        var flag = 0
        window.decorView.systemUiVisibility = flag
    }
}