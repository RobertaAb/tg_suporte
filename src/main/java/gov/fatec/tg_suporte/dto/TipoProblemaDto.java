package gov.fatec.tg_suporte.dto;
import javax.validation.constraints.NotBlank;

public class TipoProblemaDto {

    @NotBlank
    private Integer id;
    @NotBlank
    private String titulo;

}