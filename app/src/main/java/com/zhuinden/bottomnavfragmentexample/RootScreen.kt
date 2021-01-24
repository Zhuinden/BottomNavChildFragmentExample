package com.zhuinden.bottomnavfragmentexample

import androidx.fragment.app.Fragment
import com.zhuinden.simplestackextensions.fragments.DefaultFragmentKey
import kotlinx.parcelize.Parcelize

@Parcelize
class RootScreen: DefaultFragmentKey() {
    override fun instantiateFragment(): Fragment = RootFragment()
}