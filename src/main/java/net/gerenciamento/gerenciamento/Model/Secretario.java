package net.gerenciamento.gerenciamento.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "secretario")
public class Secretario extends Usuario{

    private Integer boletinsGerados;
}
