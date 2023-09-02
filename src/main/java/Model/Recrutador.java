package Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Recrutador {
    int id;
    String nome;
    String email;
    String telefone;
    String empresaAssociada;
}
