package net.gerenciamento.gerenciamento.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Nota;
import net.gerenciamento.gerenciamento.Model.Usuario;
import net.gerenciamento.gerenciamento.Repository.NotaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Service

public class NotaService {

    NotaRepository notaRepository;

    public Collection<Nota> buscarTodos(){
        return notaRepository.findAll();
    }

    public Nota buscarUm(Integer id){
        return notaRepository.findById(id).get();
    }

    public void salvar(Nota nota){
        notaRepository.save(nota);
    }
}
