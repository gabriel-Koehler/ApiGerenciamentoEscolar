package net.gerenciamento.gerenciamento.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Aluno;
import net.gerenciamento.gerenciamento.Model.Professor;
import net.gerenciamento.gerenciamento.Model.Turma;
import net.gerenciamento.gerenciamento.Model.Usuario;
import net.gerenciamento.gerenciamento.Repository.TurmaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@Service
@NoArgsConstructor
@AllArgsConstructor
@Data

public class TurmaService {
    TurmaRepository turmaRepository;

    public Collection<Turma> buscarTodos(){
        return turmaRepository.findAll();
    }
    public Turma buscarUm(Long id){
        return turmaRepository.findById(id).get();
    }

    public  void salvar(Turma turma){
        turmaRepository.save(turma);
    }

    public void adicionarProfessorTurma(Professor professor, Long idTurma){
        Turma turmaEncontrada = buscarUm(idTurma);
        turmaEncontrada.getProfessor().add(professor);
        salvar(turmaEncontrada);
    }

    public void adicionarAlunoTurma(Aluno aluno, Long idTurma){
        Turma turmaEncontrada = buscarUm(idTurma);
        aluno.setTurma(turmaEncontrada);
        salvar(turmaEncontrada);
    }


}
