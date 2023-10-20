package net.gerenciamento.gerenciamento.Controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Usuario;
import net.gerenciamento.gerenciamento.Service.AlunoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {

    AlunoService alunoService;
    @GetMapping
    public Collection<Usuario> buscarTodos(){
        return alunoService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Usuario buscarUm(@PathVariable Integer id){
        return alunoService.buscarUm(id);
    }

    @PostMapping
    public void salvar(@RequestBody Usuario usuario){
        alunoService.salvar(usuario);
    }
    @PutMapping
    public void atualizar(@RequestBody Usuario usuario){
        alunoService.salvar(usuario);
    }

}
