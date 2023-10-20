package net.gerenciamento.gerenciamento.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Professor;
import net.gerenciamento.gerenciamento.Model.Turma;
import net.gerenciamento.gerenciamento.Model.Usuario;
import net.gerenciamento.gerenciamento.Repository.ProfessorRepository;
import net.gerenciamento.gerenciamento.Repository.SecretarioRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecretarioService {
    SecretarioRepository secretarioRepository;
    ProfessorService professorService;
    public Collection<Usuario> buscarTodos(){
        return secretarioRepository.findAll();
    }
    public Usuario buscarUm(Integer id){
        return secretarioRepository.findById(id).get();
    }
    public void salvar(Usuario usuario){
        secretarioRepository.save(usuario);
    }
}
