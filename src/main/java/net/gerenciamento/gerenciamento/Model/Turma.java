package net.gerenciamento.gerenciamento.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "turma")
@Data
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long codigoTurma;
    @OneToMany
    private ArrayList<Aluno> alunos=new ArrayList();
    @OneToMany
    private Set<Professor> professor;
}
