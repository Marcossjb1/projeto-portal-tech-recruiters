package Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Candidato {
    int id;
    String nome;
    String habilidades;
    String experiencia;
    String email;
    String telefone;
}
