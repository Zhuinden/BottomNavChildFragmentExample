package com.zhuinden.bottomnavfragmentexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.zhuinden.bottomnavfragmentexample.databinding.SecondFragmentBinding
import com.zhuinden.bottomnavfragmentexample.utils.viewBinding

class SecondFragment: Fragment(R.layout.second_fragment) {
    private val binding by viewBinding(SecondFragmentBinding::bind)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textSecond.text = "Second Fragment ;)"
    }
}