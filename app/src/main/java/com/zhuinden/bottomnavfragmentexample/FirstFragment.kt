package com.zhuinden.bottomnavfragmentexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.zhuinden.bottomnavfragmentexample.databinding.FirstFragmentBinding
import com.zhuinden.bottomnavfragmentexample.utils.viewBinding

class FirstFragment: Fragment(R.layout.first_fragment) {
    private val binding by viewBinding(FirstFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textFirst.text = "First Fragment ;)"
    }
}