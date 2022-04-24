package gov.fatec.tg_suporte.repository;

import gov.fatec.tg_suporte.model.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosModelRepository extends JpaRepository<UsuariosModel, Integer> {

}