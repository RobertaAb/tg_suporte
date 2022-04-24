package gov.fatec.tg_suporte.model;

import javax.persistence.*;
@Entity
@Table(name = "procedimento")
public class ProcedimentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "solucao", nullable = false)
    private String solucao;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private UsuariosModel usuariosModel;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TipoProblemaModel tipoProblemaModel;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public UsuariosModel getUsuariosModel() {
        return usuariosModel;
    }

    public void setUsuariosModel(UsuariosModel usuariosModel) {
        this.usuariosModel = usuariosModel;
    }

    public TipoProblemaModel getTipoProblemaModel() {
        return tipoProblemaModel;
    }

    public void setTipoProblemaModel(TipoProblemaModel tipoProblemaModel) {
        this.tipoProblemaModel = tipoProblemaModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
