package com.tnal.insgiht.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tnal.insgiht.data.model.Note
import com.tnal.insgiht.databinding.ItemNoteListBinding

class NoteAdapter : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {
    private val items = mutableListOf<Note>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder.from(parent)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    fun add(noteItems: List<Note>) {
        val startPosition = items.size
        items.addAll(noteItems)
        notifyItemRangeInserted(startPosition, noteItems.size)
    }

    class NoteViewHolder(private val binding: ItemNoteListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Note) {
            binding.tvNoteTitle.text = item.title
            binding.tvCommentSummary.text = item.summary
        }

        companion object {
            fun from(parent: ViewGroup): NoteViewHolder {
                return NoteViewHolder(
                    ItemNoteListBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
        }
    }
}