package gov.fatec.tg_suporte.Service;

import gov.fatec.tg_suporte.model.TipoProblemaModel;
import gov.fatec.tg_suporte.repository.TipoProblemaModelRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class TipoProblemaService {
    final TipoProblemaModelRepository tipoProblemaModelRepository;

    public TipoProblemaService(TipoProblemaModelRepository tipoProblemaModelRepository) {
        this.tipoProblemaModelRepository = tipoProblemaModelRepository;
    }

    @Transactional
    public TipoProblemaModel save(TipoProblemaModel tipoProblemaModel) {
        return tipoProblemaModelRepository.save(tipoProblemaModel);

    }
}