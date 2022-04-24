package gov.fatec.tg_suporte.dto;
import javax.validation.constraints.NotBlank;

public class ProcedimentoDto {

    @NotBlank
    private Integer id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String solucao;

    //@NotBlank
    //private UsuariosModel usuariosModel;

    //@NotBlank
    //private TipoProblemaModel tipoProblemaModel;

}
