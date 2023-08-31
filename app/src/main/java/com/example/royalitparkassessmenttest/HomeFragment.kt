package com.example.royalitparkassessmenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.royalitparkassessmenttest.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var mBinding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding= FragmentHomeBinding.inflate(layoutInflater)
        return mBinding.root
    }

}