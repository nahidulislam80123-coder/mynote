package com.example.mynote.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import java.util.UUID

/**
 * Simple data class representing a note.
 */
data class Note(
    val id: String = UUID.randomUUID().toString(),
    val content: String
)

/**
 * ViewModel handling note state.
 */
class MainViewModel : ViewModel() {
    // Observable list of notes
    private val _notes = mutableStateListOf<Note>()
    val notes: List<Note> get() = _notes

    /** Adds a new note to the list. */
    fun addNote(content: String) {
        _notes.add(Note(content = content))
    }

    /** Retrieves a note by its unique ID. */
    fun getNoteById(id: String): Note? {
        return _notes.find { it.id == id }
    }
}