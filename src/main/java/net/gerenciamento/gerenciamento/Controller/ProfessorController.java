package net.gerenciamento.gerenciamento.Controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Nota;
import net.gerenciamento.gerenciamento.Model.Professor;
import net.gerenciamento.gerenciamento.Model.Usuario;
import net.gerenciamento.gerenciamento.Service.NotaService;
import net.gerenciamento.gerenciamento.Service.ProfessorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/professor")
public class ProfessorController {

    ProfessorService professorService;
    @GetMapping
    public Collection<Usuario> buscarTodos(){
        return professorService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Usuario buscarUm(@PathVariable Integer id){
        return professorService.buscarUm(id);
    }

    @PostMapping
    public void salvar(@RequestBody Usuario usuario){
        professorService.salvar(usuario);
    }
    @PutMapping
    public void atualizar(@RequestBody Usuario usuario){
        professorService.salvar(usuario);
    }
}
