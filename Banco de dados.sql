/*
 - Rotina de criação das tabelas do banco de dados.

 Autor: Ronaldo Silveira
 Criado em: 19/11/2017

 - Alterações:
    27/11/2017 - Ronaldo Silveira
*/

Create table PROJETO(
ID INTEGER NOT NULL PRIMARY KEY,
DESCRICAO VARCHAR(50) NOT NULL,
DT_INICIO timestamp NOT NULL,
DT_FIM timestamp NOT NULL
);

Create table TAREFAS(
ID INTEGER NOT NULL PRIMARY KEY,
ID_PROJETO INTEGER NOT NULL,
DESCRICAO VARCHAR(50) NOT NULL,
DT_INICIO timestamp NOT NULL,
DT_FIM timestamp NOT NULL
);

Create table COLABORADOR(
ID INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
NOME VARCHAR(50) NOT NULL,
EMAIL VARCHAR(50)
);

Create table TAREFA_COLABORADOR(
ID INTEGER NOT NULL PRIMARY KEY,
ID_COLABORADOR INTEGER NOT NULL,
ID_TAREFA INTEGER NOT NULL
);

Create table LISTA_TAREFAS(
ID INTEGER NOT NULL PRIMARY KEY,
ID_TAREFA INTEGER NOT NULL,
ID_TAREFA_PENDENTE INTEGER NOT NULL,
FINALIZADA VARCHAR(1) NOT NULL
);

ALTER TABLE TAREFAS ADD CONSTRAINT FK_ID_PROJETO FOREIGN KEY (ID_PROJETO) REFERENCES PROJETO (ID);
ALTER TABLE TAREFA_COLABORADOR ADD CONSTRAINT FK_ID_COLABORADOR FOREIGN KEY (ID_COLABORADOR) REFERENCES COLABORADOR (ID);
ALTER TABLE TAREFA_COLABORADOR ADD CONSTRAINT FK_ID_TAREFA FOREIGN KEY (ID_TAREFA) REFERENCES TAREFAS (ID);
ALTER TABLE LISTA_TAREFAS ADD CONSTRAINT FK_ID_TAREFA_PR FOREIGN KEY (ID_TAREFA) REFERENCES TAREFAS (ID);
ALTER TABLE LISTA_TAREFAS ADD CONSTRAINT FK_ID_TAREFA_PENDENTE FOREIGN KEY (ID_TAREFA) REFERENCES TAREFAS (ID);