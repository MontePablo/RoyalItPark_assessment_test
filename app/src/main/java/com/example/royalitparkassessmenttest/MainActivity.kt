package com.example.royalitparkassessmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.royalitparkassessmenttest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),GalleryOptions {
    lateinit var mBinding:ActivityMainBinding
    lateinit var fragHome:HomeFragment
    lateinit var fragGallary:GallaryFragment
    lateinit var fragProfile: ProfileFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        fragHome=HomeFragment(this)
        fragGallary=GallaryFragment()
        fragProfile=ProfileFragment()
        replaceFragment(fragHome)

        mBinding.bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.nav_home ->{
                    replaceFragment(fragHome)
                }
                R.id.nav_gallary -> {
                    replaceFragment(fragGallary)
                }
                R.id.nav_profile ->{
                    replaceFragment(fragProfile)
                }
            }
            true
        }


    }
    fun replaceFragment(fragment: Fragment){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(mBinding.fragmentContainer.id,fragment).commit()
    }

    override fun gotoGallary() {
        replaceFragment(fragGallary)
    }
}