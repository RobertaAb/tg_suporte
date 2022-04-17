package gov.fatec.tg_suporte.model;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "procedimento")
public class ProcedimentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_procedimento;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "problema", nullable = false)
    private String problema;

    @Column(name = "solucao", nullable = false)
    private String solucao;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_usuario")
    private UsuariosModel usuariosModel;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_problema")
    private TipoProblemaModel tipoProblemaModel;

}
