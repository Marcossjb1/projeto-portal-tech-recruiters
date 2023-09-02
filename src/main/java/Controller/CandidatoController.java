package Controller;

import Service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidato")
public class CandidatoController {

    @Autowired
    private CandidatoService CandidatoService;

    @PostMapping("/inserir-candidato")
    public inserirCandidato(){
    }

    @PostMapping("/inserir-habilidades")
    public inserirHabilidades(){

    }

    @PostMapping("/inserir-experiencias")
    public inserirExperiencias(){

    }


}
