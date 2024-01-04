package com.tnal.insgiht.ui

import android.os.Bundle
import android.view.View
import com.tnal.insgiht.R
import com.tnal.insgiht.base.BaseFragment
import com.tnal.insgiht.data.model.Note
import com.tnal.insgiht.databinding.FragmentNoteBinding

class NoteFragment : BaseFragment<FragmentNoteBinding>(R.layout.fragment_note) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setLayout()
    }

    override fun setLayout() {
        val adapter = NoteAdapter()
        adapter.add(createItems())
        binding.rvNoteList.adapter = adapter
    }

    private fun createItems(): List<Note> {
        return mutableListOf(
            Note("", "노트 제목 1", "노트 한 줄 요약 1"),
            Note("", "노트 제목 2", "노트 한 줄 요약 2"),
            Note("", "노트 제목 3", "노트 한 줄 요약 3"),
            Note("", "노트 제목 4", "노트 한 줄 요약 4"),
            Note("", "노트 제목 5", "노트 한 줄 요약 5"),
            Note("", "노트 제목 6", "노트 한 줄 요약 6"),
            Note("", "노트 제목 7", "노트 한 줄 요약 7"),
            Note("", "노트 제목 8", "노트 한 줄 요약 8"),
            Note("", "노트 제목 9", "노트 한 줄 요약 9"),
            Note("", "노트 제목 10", "노트 한 줄 요약 10"),
            Note("", "노트 제목 11", "노트 한 줄 요약 11"),
        )
    }
}