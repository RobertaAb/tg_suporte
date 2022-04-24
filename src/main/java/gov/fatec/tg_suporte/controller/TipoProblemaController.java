package gov.fatec.tg_suporte.controller;

import gov.fatec.tg_suporte.Service.TipoProblemaService;
import gov.fatec.tg_suporte.dto.TipoProblemaDto;
import gov.fatec.tg_suporte.model.TipoProblemaModel;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/tipoProblema")
public class TipoProblemaController {
    final TipoProblemaService tipoProblemaService;

    public TipoProblemaController(TipoProblemaService tipoProblemaService) {
        this.TipoProblemaService = tipoProblemaService;
    }

    @PostMapping
    public ResponseEntity<Object> saveTipoProblema(@RequestBody @Valid TipoProblemaDto tipoProblemaDto){
        var tipoProblemaModel = new TipoProblemaModel();
        BeanUtils.copyProperties(tipoProblemaDto, tipoProblemaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoProblemaService.save(tipoProblemaModel));
    }

}