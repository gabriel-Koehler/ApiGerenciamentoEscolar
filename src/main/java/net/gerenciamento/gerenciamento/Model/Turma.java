package net.gerenciamento.gerenciamento.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "turma")
@Data
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoTurma;
    @OneToMany(mappedBy = "turma")
    private Set<Aluno> aluno;
    @ManyToOne
    private Professor professor;
}
