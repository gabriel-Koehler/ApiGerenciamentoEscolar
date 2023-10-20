package net.gerenciamento.gerenciamento.Repository;

import net.gerenciamento.gerenciamento.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProfessorRepository extends JpaRepository<Usuario,Integer> {
}
