package Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Empresa {
    int id;
    String nome;
    String descricao;
    String listaDeRecrutadores;
}
