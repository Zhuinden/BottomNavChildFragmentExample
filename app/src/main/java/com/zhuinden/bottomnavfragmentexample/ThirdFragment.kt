package com.zhuinden.bottomnavfragmentexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.zhuinden.bottomnavfragmentexample.databinding.ThirdFragmentBinding
import com.zhuinden.bottomnavfragmentexample.utils.viewBinding

class ThirdFragment: Fragment(R.layout.third_fragment) {
    private val binding by viewBinding(ThirdFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textThird.text = "Third Fragment ;)"
    }
}