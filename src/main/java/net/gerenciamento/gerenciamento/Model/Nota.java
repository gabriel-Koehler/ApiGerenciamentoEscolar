package net.gerenciamento.gerenciamento.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nota")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    @OneToOne
    private Disciplina disciplina;
    @ManyToOne
    private Aluno idAluno;
    private double valorNota;
}
