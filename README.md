# tg_suporte

Classe Usuarios
- id_usuario
- nome
- email
- senha
- status_usuario
- tipo_usuario
- role_deletar
- role_atualizar
- role_salvar

Classe Procedimento
- id_procedimento
- titulo
- problema
- solucao
+ id_usuario fk
+ id_tipo_problema fk

Classe Tipo problema
- id_tipo_problema
- descricao_problema


// USUARIOS
CREATE TABLE USUARIOS (
  id_usuario INT UNIQUE AUTOINCREMENT,
  nome VARCHAR(255),
  email VARCHAR(255),
  senha VARCHAR(255),
  status_usuario VARCHAR(255),
  tipo_usuario VARCHAR(255),
  role_deletar VARCHAR(255),
  role_atualizar VARCHAR(255),
  role_salvar VARCHAR(255)
);


// TIPO_PROBLEMA
CREATE TABLE TIPO_PROBLEMA(
  id_tipo_problema INT UNIQUE AUTOINCREMENT,
  descricao_problema VARCHAR(255)
);


// PROCEDIMENTO
CREATE TABLE PROCEDIMENTO(
  id_procedimento INT UNIQUE AUTOINCREMENT,
  titulo VARCHAR(255),
  problema VARCHAR(255),
  solucao VARCHAR(255)
  id_usuario INT
  id_tipo_problema INT
);


ALTER TABLE PROCEDIMENTO
ADD FOREIGN KEY (id_usuario) REFERENCES USUARIOS(id_usuario);

ALTER TABLE PROCEDIMENTO
ADD FOREIGN KEY (id_tipo_problema) REFERENCES TIPO_PROBLEMA(id_tipo_problema);
