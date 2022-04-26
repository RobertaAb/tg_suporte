package gov.fatec.tg_suporte.controller;

import gov.fatec.tg_suporte.service.TipoProblemaService;
import gov.fatec.tg_suporte.dto.TipoProblemaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/tipoProblema")
public class TipoProblemaController {
    @Autowired
    TipoProblemaService tipoProblemaService;

     @PostMapping
    public ResponseEntity<Object> saveTipoProblema(@RequestBody @Valid TipoProblemaDto tipoProblemaDto){
            return ResponseEntity.status(HttpStatus.CREATED).body(tipoProblemaService.save(tipoProblemaDto));
    }

}