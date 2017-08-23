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
     * 全屏，会隐藏StatusBar
     */
    var action_hide_status_bar = View.SYSTEM_UI_FLAG_FULLSCREEN
    /**
     * 系统4.1或者更高版本，可以使StatusBar浮在内容上面，
     *
     * 与 View.SYSTEM_UI_FLAG_FULLSCREEN效果类似
     */
    var action_hide_status_bar_float = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
    /**
     * 隐藏NavigationBar
     */
    var action_navigation_bar_hide = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
    /**
     * 系统4.1或者更高版本，可以让NavigationBar浮在内容上面。
     */
    var action_navigation_bar_hide_float = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
    /**
     * 与SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION或者SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
     * 结合使用，确保布局稳定
     */
    var action_stable = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
    /**
     * 在系统4.0，API14以上使StatusBar和NavigationBar暗淡显示。
     */
    var action_dim = View.SYSTEM_UI_FLAG_LOW_PROFILE
    /**
     * 系统4.4 出现，该flag可以让触碰屏幕，程序重新出现System bar。
     */
    var action_immersive = View.SYSTEM_UI_FLAG_IMMERSIVE
    /**
     * 系统4.4 出现，该flag可以让触碰屏幕，系统bar出现，但是一会儿自动消失。Sticky方式
     */
    var action_immersive_sticky = View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY

    /**
     * Sticky风格
     */
    fun setStickyStyle(window: Window) {
        var flag = action_navigation_bar_hide or action_hide_status_bar or action_hide_status_bar_float or action_navigation_bar_hide_float or action_stable or action_immersive_sticky
        window.decorView.systemUiVisibility = flag
    }
    /**
     * Immersive风格
     */
    fun setImmersiveStyle(window: Window) {
        var flag = action_navigation_bar_hide or action_hide_status_bar or action_hide_status_bar_float or action_navigation_bar_hide_float or action_stable or action_immersive
        window.decorView.systemUiVisibility = flag
    }

    /**
     * Navigation bar 正常风格，且设置StatusBar正常隐藏
     */
    fun setNavigationBarNormalStyle(window: Window) {
        var flag = action_navigation_bar_hide or action_hide_status_bar
        window.decorView.systemUiVisibility = flag
    }
    /**
     * Navigation bar 浮层风格，且设置StatusBar浮层效果
     */
    fun setNavigationBarFloatStyle(window: Window) {
        var flag =  action_navigation_bar_hide or action_hide_status_bar or action_navigation_bar_hide or action_hide_status_bar_float or action_stable
        window.decorView.systemUiVisibility = flag
    }
    /**
     * StatusBar正常隐藏的风格
     */
    fun setStatusNormalStyle(window: Window) {
        var flag =  action_hide_status_bar
        window.decorView.systemUiVisibility = flag
    }
    /**
     * StatusBar浮层隐藏的风格
     */
    fun setStatusFloatStyle(window: Window) {
        var flag =  action_hide_status_bar or action_hide_status_bar_float or action_stable
        window.decorView.systemUiVisibility = flag
    }
    /**
     * System Bar暗淡风格
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