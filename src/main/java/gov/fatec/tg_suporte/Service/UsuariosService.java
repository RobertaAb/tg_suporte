package gov.fatec.tg_suporte.Service;
import javax.transaction.Transactional;

import gov.fatec.tg_suporte.model.UsuariosModel;
import gov.fatec.tg_suporte.repository.UsuariosModelRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    final UsuariosModelRepository usuariosModelRepository;

    public UsuariosService(UsuariosModelRepository usuariosModelRepository) {
        this.usuariosModelRepository = usuariosModelRepository;
    }

    @Transactional
    public UsuariosModel save(UsuariosModel usuariosModel) {
        return usuariosModelRepository.save(usuariosModel);

    }


}