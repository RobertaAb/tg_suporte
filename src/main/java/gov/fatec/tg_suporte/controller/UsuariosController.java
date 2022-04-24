package gov.fatec.tg_suporte.controller;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.validation.Valid;

import gov.fatec.tg_suporte.Service.UsuariosService;
import gov.fatec.tg_suporte.dto.UsuariosDto;
import gov.fatec.tg_suporte.model.UsuariosModel;
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
@RequestMapping("/usuarios")
public class UsuariosController {

    final UsuariosService usuariosService;

    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

        @PostMapping
        public ResponseEntity<Object> saveUsuarios(@RequestBody @Valid UsuariosDto usuariosDto){
            var usuariosModel = new UsuariosModel();
            BeanUtils.copyProperties(usuariosDto, usuariosModel);
            usuariosModel.setRegistrationDate (LocalDateTime.now(ZoneId.of("UTC")));
            return ResponseEntity.status(HttpStatus.CREATED).body(usuariosService.save(usuariosModel));
        }

    }