package com.example.royalitparkassessmenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.royalitparkassessmenttest.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var mBinding:ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivitySignupBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.apply {
            button.setOnClickListener(View.OnClickListener {
                startActivity(Intent(applicationContext,MainActivity::class.java))
            })
        }
    }
}