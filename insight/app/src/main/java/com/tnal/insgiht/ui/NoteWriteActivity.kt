package com.tnal.insgiht.ui

import com.tnal.insgiht.R
import com.tnal.insgiht.base.BaseActivity
import com.tnal.insgiht.databinding.ActivityNoteWriteBinding

class NoteWriteActivity : BaseActivity<ActivityNoteWriteBinding>(R.layout.activity_note_write) {
    override fun setLayout() {
        binding.toolbarNoteWrite.setNavigationOnClickListener {
            finish()
        }
        binding.btnWriteComplete.setOnClickListener {
            finish()
        }
    }
}