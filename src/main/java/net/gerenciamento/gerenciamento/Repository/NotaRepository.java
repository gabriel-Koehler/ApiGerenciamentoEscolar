package net.gerenciamento.gerenciamento.Repository;
import net.gerenciamento.gerenciamento.Model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<Nota,Integer> {
}
