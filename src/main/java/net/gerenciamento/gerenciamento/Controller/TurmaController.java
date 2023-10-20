package net.gerenciamento.gerenciamento.Controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Turma;
import net.gerenciamento.gerenciamento.Model.Usuario;
import net.gerenciamento.gerenciamento.Service.SecretarioService;
import net.gerenciamento.gerenciamento.Service.TurmaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/turma")
public class TurmaController {

    TurmaService turmaService;
    @GetMapping
    public Collection<Turma> buscarTodos(){
        return turmaService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Turma buscarUm(@PathVariable Long id){
        return turmaService.buscarUm(id);
    }

    @PostMapping
    public void salvar(@RequestBody Turma turma){
        turmaService.salvar(turma);
    }
    @PutMapping
    public void atualizar(@RequestBody Turma turma){
        turmaService.salvar(turma);
    }
}
