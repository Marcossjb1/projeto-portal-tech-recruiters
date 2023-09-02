package Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Entrevista {
    int id;
    Date dataEHora;
    String recrutadorAssociado;
    String statusEntrevista;
}
