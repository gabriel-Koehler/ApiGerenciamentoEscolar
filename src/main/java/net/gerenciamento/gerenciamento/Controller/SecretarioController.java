package net.gerenciamento.gerenciamento.Controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.gerenciamento.gerenciamento.Model.Secretario;
import net.gerenciamento.gerenciamento.Model.Usuario;
import net.gerenciamento.gerenciamento.Service.ProfessorService;
import net.gerenciamento.gerenciamento.Service.SecretarioService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/secretario")
public class SecretarioController {

    SecretarioService secretarioService;
    @GetMapping
    public Collection<Usuario> buscarTodos(){
        return secretarioService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Usuario buscarUm(@PathVariable Integer id){
        return secretarioService.buscarUm(id);
    }

    @PostMapping
    public void salvar(@RequestBody Usuario usuario){
        secretarioService.salvar(usuario);
    }
    @PutMapping
    public void atualizar(@RequestBody Usuario usuario){
        secretarioService.salvar(usuario);
    }
}
