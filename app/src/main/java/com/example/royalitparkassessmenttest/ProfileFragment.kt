package com.example.royalitparkassessmenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.royalitparkassessmenttest.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    lateinit var mBinding:FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding= FragmentProfileBinding.inflate(layoutInflater)
        return mBinding.root
    }

}