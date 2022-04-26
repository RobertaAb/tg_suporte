package gov.fatec.tg_suporte.service;

import gov.fatec.tg_suporte.dto.TipoProblemaDto;
import gov.fatec.tg_suporte.model.TipoProblemaModel;
import gov.fatec.tg_suporte.repository.TipoProblemaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
public class TipoProblemaService {
   @Autowired
   TipoProblemaRepository tipoProblemaRepository;
    @Transactional
    public TipoProblemaModel save(TipoProblemaDto tipoProblemaDto) {
        var tipoProblemaModel = new TipoProblemaModel();
        BeanUtils.copyProperties(tipoProblemaDto, tipoProblemaModel);
        tipoProblemaModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return TipoProblemaRepository.save(tipoProblemaModel);
    }
}
