package com.example.royalitparkassessmenttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.royalitparkassessmenttest.databinding.FragmentGallaryBinding

class GallaryFragment: Fragment() {

    lateinit var mBinding: FragmentGallaryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding= FragmentGallaryBinding.inflate(layoutInflater)
        return mBinding.root
    }


}
interface GalleryOptions{
    fun gotoGallary()
}