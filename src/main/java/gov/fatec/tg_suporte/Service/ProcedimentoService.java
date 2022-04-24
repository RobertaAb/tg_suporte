package gov.fatec.tg_suporte.Service;
import javax.transaction.Transactional;

import gov.fatec.tg_suporte.model.ProcedimentoModel;
import gov.fatec.tg_suporte.repository.ProcedimentoModelRepository;
import org.springframework.stereotype.Service;

@Service
public class ProcedimentoService {

        final ProcedimentoModelRepository procedimentoModelRepository;

        public ProcedimentoService(ProcedimentoModelRepository procedimentoModelRepository) {
            this.procedimentoModelRepository = procedimentoModelRepository;
        }

        @Transactional
        public ProcedimentoModel save(ProcedimentoModel procedimentoModel) {
            return procedimentoModelRepository.save(procedimentoModel);

        }


    }
