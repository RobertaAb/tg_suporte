package gov.fatec.tg_suporte.service;

import gov.fatec.tg_suporte.dto.TipoProblemaDto;
import gov.fatec.tg_suporte.model.TipoProblemaModel;
import gov.fatec.tg_suporte.repository.TipoProblemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TipoProblemaService {
   @Autowired
   TipoProblemaRepository tipoProblemaRepository;
    @Transactional
    public TipoProblemaModel save(TipoProblemaDto tipoProblemaDto) {
        return TipoProblemaRepository.save(tipoProblemaModel);

    }
}
