package com.example.royalitparkassessmenttest

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.royalitparkassessmenttest.databinding.FragmentHomeBinding


class HomeFragment(listener: GalleryOptions)  : Fragment() {
    lateinit var mBinding:FragmentHomeBinding
    lateinit var listener:GalleryOptions
    init {
        this.listener=listener
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding= FragmentHomeBinding.inflate(layoutInflater)

        mBinding.viewMoreBtn.setOnClickListener(View.OnClickListener {
            listener.gotoGallary()
        })
        return mBinding.root
    }

}