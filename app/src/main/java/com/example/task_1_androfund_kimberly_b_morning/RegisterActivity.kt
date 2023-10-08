package com.example.task_1_androfund_kimberly_b_morning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnRegister: Button
    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText
    private lateinit var edtConfirmPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnRegister = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener(this)

        edtUsername = findViewById(R.id.edt_username)
        edtPassword = findViewById(R.id.edt_password)
        edtConfirmPassword = findViewById(R.id.edt_confirm_password)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_register -> {
                val bundle = Bundle()
                bundle.putString("username", edtUsername.text.toString())
                bundle.putString("password", edtPassword.text.toString())

                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}