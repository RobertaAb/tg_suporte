package gov.fatec.tg_suporte.model;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuariosModel {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_usuario;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "senha", nullable = false)
	private String senha;

	@Column(name = "status_usuario", nullable = false)
	private String status_usuario;

	@Column(name = "tipo_usuario", nullable = false)
	private String tipo_usuario;

	@Column(name = "role_deletar", nullable = false)
	private String role_deletar;

	@Column(name = "role_atualizar", nullable = false)
	private String role_atualizar;

	@Column(name = "role_salvar", nullable = false)
	private String role_salvar;

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getStatus_usuario() {
		return status_usuario;
	}

	public void setStatus_usuario(String status_usuario) {
		this.status_usuario = status_usuario;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public String getRole_deletar() {
		return role_deletar;
	}

	public void setRole_deletar(String role_deletar) {
		this.role_deletar = role_deletar;
	}

	public String getRole_atualizar() {
		return role_atualizar;
	}

	public void setRole_atualizar(String role_atualizar) {
		this.role_atualizar = role_atualizar;
	}

	public String getRole_salvar() {
		return role_salvar;
	}

	public void setRole_salvar(String role_salvar) {
		this.role_salvar = role_salvar;
	}
}
