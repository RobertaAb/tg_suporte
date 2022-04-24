package gov.fatec.tg_suporte.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UsuariosDto {

    @NotBlank
    private Integer id;

    @NotBlank
    private String nome;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String senha;

    @NotBlank
    private String status;

    @NotBlank
    private String tipo_usuario;

    @NotBlank
    private String deletar;

    @NotBlank
    private String atualizar;

    @NotBlank
    private String salvar;
}