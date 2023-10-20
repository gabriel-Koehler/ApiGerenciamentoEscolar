package net.gerenciamento.gerenciamento.Repository;

import net.gerenciamento.gerenciamento.Model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProfessorRepository extends JpaRepository<Professor,Integer> {
}
