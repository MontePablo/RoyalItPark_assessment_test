package com.example.royalitparkassessmenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.royalitparkassessmenttest.databinding.ActivityTitleBinding
import com.example.royalitparkassessmenttest.databinding.FragmentHomeBinding
import kotlin.math.sign

class TitleActivity : AppCompatActivity() {
    lateinit var mBinding: ActivityTitleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivityTitleBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        mBinding.apply {
            loginBtn.setOnClickListener(View.OnClickListener {
                startActivity(Intent(applicationContext,LoginActivity::class.java))
            })
            signupBtn.setOnClickListener(View.OnClickListener {
                startActivity(Intent(applicationContext,SignupActivity::class.java))
            })
        }
    }
}