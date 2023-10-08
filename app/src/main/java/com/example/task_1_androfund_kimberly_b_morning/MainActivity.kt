package com.example.task_1_androfund_kimberly_b_morning

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnHome: Button
    private lateinit var tvHome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btn_home)
        btnHome.setOnClickListener(this)

        tvHome = findViewById(R.id.tv_home)
        val btnFragment: Button = findViewById(R.id.btn_fragment)
        btnFragment.setOnClickListener(this)

        val username = intent.getParcelableExtra<UserInfo>("UserInfo")?.username
        val password = intent.getParcelableExtra<UserInfo>("UserInfo")?.password

        tvHome.text = "Username: $username\nPassword: $password"
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_home -> {
//                val message = "Welcome"
//                val intent = Intent()
//
//                intent.action = Intent.ACTION_SEND
//                intent.putExtra(Intent.EXTRA_TEXT, message)
//
//                intent.type = "text/plain"
//                startActivity(intent)

                val intent = Intent()
                intent.putExtra("history", "Anda sudah login")
                setResult(RESULT_OK, intent)
                finish()
            }
            R.id.btn_fragment -> {
                val intent = Intent(this@MainActivity, FragmentActivity::class.java)
                startActivity(intent)
            }
        }
    }
}