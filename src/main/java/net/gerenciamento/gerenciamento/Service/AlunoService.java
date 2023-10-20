package net.gerenciamento.gerenciamento.Service;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Aluno;
import net.gerenciamento.gerenciamento.Model.Usuario;
import net.gerenciamento.gerenciamento.Repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AlunoService {
    AlunoRepository alunoRepository;

    public Collection<Aluno> buscarTodos(){
        return alunoRepository.findAll();
    }

    public Aluno buscarUm(Integer id){
        return alunoRepository.findById(id).get();
    }

    public void salvar(Aluno usuario){
        alunoRepository.save(usuario);
    }

}
