package com.example.baselibrary

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zackratos.ultimatebarx.ultimatebarx.statusBar

open class BaseActivity : AppCompatActivity() {

    protected fun test() {
        statusBar {
            // 布局是否侵入状态栏（true 不侵入，false 侵入）
            fitWindow = false
            // 状态栏背景颜色（色值）
            color = Color.TRANSPARENT
            // 状态栏背景颜色（资源 id）
            //colorRes = R.color.deepSkyBlue
            // 状态栏背景 drawable
            // drawableRes = R.drawable.bg_common
            // 以上三个设置背景的方法用一个即可，如多次设置，后面的会把前面的覆盖掉
            // light模式：状态栏字体 true: 灰色，false: 白色 Android 6.0+
            light = true
            // 低版本 light 模式不生效，重新设置状态栏背景
            // 防止状态栏背景色跟字体颜色一致导致字体看不见
            // lvl 系列方法仅在低版本（不支持 light 模式的版本）下开启 light 模式生效
            lvlColor = Color.BLACK
            //lvlColorRes = R.color.cyan
            //lvlDrawableRes = R.drawable.bg_lvl
        }
    }
}