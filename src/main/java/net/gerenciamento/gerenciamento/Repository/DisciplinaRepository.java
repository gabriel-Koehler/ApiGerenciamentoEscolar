package net.gerenciamento.gerenciamento.Repository;

import net.gerenciamento.gerenciamento.Model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina,Long> {
}
