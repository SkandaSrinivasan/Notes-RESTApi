package com.sknotes.notesapi.repository;

import com.sknotes.notesapi.models.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {
}
