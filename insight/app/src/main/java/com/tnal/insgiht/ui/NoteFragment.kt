package com.tnal.insgiht.ui

import android.os.Bundle
import android.view.View
import com.tnal.insgiht.R
import com.tnal.insgiht.base.BaseFragment
import com.tnal.insgiht.databinding.FragmentNoteBinding

class NoteFragment : BaseFragment<FragmentNoteBinding>(R.layout.fragment_note) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setLayout()
    }

    override fun setLayout() {
    }
}