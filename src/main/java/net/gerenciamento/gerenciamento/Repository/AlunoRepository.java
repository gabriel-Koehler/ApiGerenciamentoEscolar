package net.gerenciamento.gerenciamento.Repository;

import net.gerenciamento.gerenciamento.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
