package gov.fatec.tg_suporte.model;

import javax.persistence.*;

@Entity
@Table(name = "tipo_problema")
public class TipoProblemaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipo_problema;

    @Column(name = "descricao_problema", nullable = false)
    private String descricao_problema;

    public Integer getId_tipo_problema() {
        return id_tipo_problema;
    }

    public void setId_tipo_problema(Integer id_tipo_problema) {
        this.id_tipo_problema = id_tipo_problema;
    }

    public String getDescricao_problema() {
        return descricao_problema;
    }

    public void setDescricao_problema(String descricao_problema) {
        this.descricao_problema = descricao_problema;
    }
}
