package net.gerenciamento.gerenciamento.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "aluno")
public class Aluno extends Usuario{

    @OneToMany(mappedBy = "aluno")
    private ArrayList<Nota> nota=new ArrayList<>();
    @ManyToOne
    private Turma turma;

}
