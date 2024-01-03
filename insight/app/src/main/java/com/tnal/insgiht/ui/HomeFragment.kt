package com.tnal.insgiht.ui

import android.os.Bundle
import android.view.View
import com.tnal.insgiht.R
import com.tnal.insgiht.base.BaseFragment
import com.tnal.insgiht.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setLayout()
    }

    override fun setLayout() {
        binding
    }
}