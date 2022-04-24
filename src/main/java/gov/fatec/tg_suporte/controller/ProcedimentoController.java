package gov.fatec.tg_suporte.controller;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import gov.fatec.tg_suporte.Service.ProcedimentoService;
import gov.fatec.tg_suporte.dto.ProcedimentoDto;
import gov.fatec.tg_suporte.model.ProcedimentoModel;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/procedimento")
public class ProcedimentoController {
    final ProcedimentoService procedimentoService;

    public ProcedimentoController(ProcedimentoService procedimentoService) {
        this.procedimentoService = procedimentoService;
    }

    @PostMapping
    public ResponseEntity<Object> saveProcedimento(@RequestBody @Valid ProcedimentoDto procedimentoDto){
        var procedimentoModel = new ProcedimentoModel();
        BeanUtils.copyProperties(procedimentoDto, procedimentoModel);
        procedimentoModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(procedimentoService.save(procedimentoModel));
    }

}
