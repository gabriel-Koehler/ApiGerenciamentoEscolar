package net.gerenciamento.gerenciamento.Controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Disciplina;
import net.gerenciamento.gerenciamento.Model.Nota;
import net.gerenciamento.gerenciamento.Service.DisciplinaService;
import net.gerenciamento.gerenciamento.Service.NotaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/nota")
public class NotaController {

    NotaService notaService;
    @GetMapping
    public Collection<Nota> buscarTodos(){
        return notaService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Nota buscarUm(@PathVariable Integer id){
        return notaService.buscarUm(id);
    }

    @PostMapping
    public void salvar(@RequestBody Nota nota){
        notaService.salvar(nota);
    }
    @PutMapping
    public void atualizar(@RequestBody Nota nota){
        notaService.salvar(nota);
    }
}
