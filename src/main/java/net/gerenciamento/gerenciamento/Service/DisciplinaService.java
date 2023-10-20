package net.gerenciamento.gerenciamento.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Disciplina;
import net.gerenciamento.gerenciamento.Repository.DisciplinaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DisciplinaService {

    DisciplinaRepository disciplinaRepository;

    public Collection<Disciplina> buscarTodos(){
        return disciplinaRepository.findAll();
    }

    public Disciplina buscarUm(Long id){
        return disciplinaRepository.findById(id).get();
    }

    public void salvar(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
    }

}
