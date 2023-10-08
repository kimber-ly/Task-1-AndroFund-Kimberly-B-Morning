package com.example.task_1_androfund_kimberly_b_morning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val fragmentManager = supportFragmentManager
        val fragmentOne = FragmentOne()

        val fragment1 = fragmentManager.findFragmentByTag(fragmentOne::class.java.simpleName)

        if (fragment1 !is FragmentOne){
            fragmentManager
                .beginTransaction()
                .add(R.id.container, fragmentOne, FragmentOne::class.java.simpleName)
                .commit()
        }
    }
}