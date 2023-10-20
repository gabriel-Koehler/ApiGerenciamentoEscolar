package net.gerenciamento.gerenciamento.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Professor;

import net.gerenciamento.gerenciamento.Repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Data

public class ProfessorService {
    ProfessorRepository professorRepository;

    public Collection<Professor> buscarTodos(){
        return professorRepository.findAll();
    }

    public Professor buscarUm(Integer id){
        return  professorRepository.findById(id).get();
    }

    public void salvar(Professor professor){
        professorRepository.save(professor);
    }
}

