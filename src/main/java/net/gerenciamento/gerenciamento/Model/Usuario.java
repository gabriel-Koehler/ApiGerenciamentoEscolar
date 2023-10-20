package net.gerenciamento.gerenciamento.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
    @Column(name = "idade")
    private Integer idade;
    @Column(name = "nome")
    private String nome;
    @Column(name = "endereco")
    private String endereco;
}
