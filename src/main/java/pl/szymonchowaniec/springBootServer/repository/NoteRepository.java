package pl.szymonchowaniec.springBootServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szymonchowaniec.springBootServer.model.Note;
import pl.szymonchowaniec.springBootServer.model.Notebook;

import java.util.List;
import java.util.UUID;

public interface NoteRepository extends JpaRepository<Note, UUID> {
    List<Note> findAllByNotebook(Notebook notebook);

}
