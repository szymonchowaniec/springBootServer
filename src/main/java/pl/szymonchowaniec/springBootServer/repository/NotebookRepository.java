package pl.szymonchowaniec.springBootServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szymonchowaniec.springBootServer.model.Notebook;

import java.util.UUID;

public interface NotebookRepository extends JpaRepository<Notebook, UUID> {
}
