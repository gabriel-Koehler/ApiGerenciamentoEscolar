package net.gerenciamento.gerenciamento.Controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Disciplina;
import net.gerenciamento.gerenciamento.Model.Usuario;
import net.gerenciamento.gerenciamento.Service.AlunoService;
import net.gerenciamento.gerenciamento.Service.DisciplinaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/disciplina")
public class DisciplinaController {

    DisciplinaService disciplinaService;
    @GetMapping
    public Collection<Disciplina> buscarTodos(){
        return disciplinaService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Disciplina buscarUm(@PathVariable Long id){
        return disciplinaService.buscarUm(id);
    }

    @PostMapping
    public void salvar(@RequestBody  Disciplina disciplina){
        disciplinaService.salvar(disciplina);
    }
    @PutMapping
    public void atualizar(@RequestBody Disciplina disciplina){
        disciplinaService.salvar(disciplina);
    }

}
