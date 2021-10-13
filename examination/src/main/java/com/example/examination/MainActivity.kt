package com.example.examination

import android.os.Bundle
import com.example.baselibrary.BaseActivity


/**
 * 首页
 */
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
    }

}