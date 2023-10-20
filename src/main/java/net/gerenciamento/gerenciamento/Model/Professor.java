package net.gerenciamento.gerenciamento.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "professor")
public class Professor extends Usuario{

    @OneToMany(mappedBy = "professor")
    private Set<Turma> turma;
    @OneToMany
    private Set<Disciplina> disciplina;

}
