package net.gerenciamento.gerenciamento.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Usuario;
import net.gerenciamento.gerenciamento.Repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Data

public class ProfessorService {
    ProfessorRepository professorRepository;

    public Collection<Usuario> buscarTodos(){
        return professorRepository.findAll();
    }

    public Usuario buscarUm(Integer id){
        return  professorRepository.findById(id).get();
    }

    public void salvar(Usuario usuario){
        professorRepository.save(usuario);
    }
}

