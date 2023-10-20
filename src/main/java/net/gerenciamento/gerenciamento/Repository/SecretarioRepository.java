package net.gerenciamento.gerenciamento.Repository;

import net.gerenciamento.gerenciamento.Model.Secretario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SecretarioRepository extends JpaRepository<Secretario,Integer> {
}
