# Trabalho 3 de Laboratório de Programação III - 2017.3

#### Nome: José Ronaldo Matricula: 201176016  Curso: Sistemas de Informação <br> Nome: Lucas Diniz da Costa Matricula: 201465524A   Curso: Ciências Exatas

**Texto Explicativo:**<p align="justify"> O sistema tem como objetivo armazenar e trabalhar com o gerenciamento de tarefas, projetos e colaboradores. Além disso, visa ter uma melhor estruturação para facilitar o entendimento pelo usuário.</p>

**Modelo de dados:**

<a href="https://ibb.co/moY3cm"><img src="https://image.ibb.co/daiQq6/Main.png" alt="Main" border="0"></a>

<p align="justify">Os dados estão estruturados em classes baseadas no conceito de orientação a objetos. Temos o colaborador que possui nome, email e um indice do banco de dados, os colaboradores serão os responsáveis por executar as tarefas presente nos projetos. Um projeto possui uma descrição, índice de identificação, data de início e término além de apresentar uma lista de tarefas. As tarefas podem ser realizadas por mais de um colaborador, data de início, data de término, descrição e pode ocorrer de uma tarefa depender de outra para prosseguir na execução do projeto.</p>

**Modelo do banco de dados:**

<a href="https://ibb.co/dhLnvG"><img src="https://image.ibb.co/eFvLFG/ModeloBD.png" alt="ModeloBD" border="0"></a>


**Classes utilizadas:**

- Interfaces:
	- AtribuirDependencia;
	- AtribuirColaborador;
	- ConsultaTarefas;
	- JanelaPrincipal;
	- CadastrarColaborador;
	- CadastrarProjeto;
	- CadastrarTarefa
- Dados:
	- Colaborador;
	- Projeto;
	- Tarefa;
- Conexão do banco:
	- ConexaoJavaDB;
- DAOs:
	- ColaboradorDAO;
	- TarefaDAO;
	- ProjetoDAO;
- DAOSJDBC(Classes auxiliares para utilizar as operações do banco de dados):
	- ColaboradorDAOJDBC;
	- TarefaDAOJDBC;
	- ProjetoDAOJDBC;
- Principal:
	- Main;

**Instruções para a execução inicial e montagem do banco de dados:**

1.	<p align="justify">Criar uma banco de dados local no projeto: Nome: **BD** Usuário: **usuario** Senha: **senha** </p>
2.	<p align="justify">Execute o arquivo **Banco de dados.sql** para que todas as tabelas e estrutura do banco de dados seja criado.</p>

**Pontos que podem ser melhorados:**

- <p align="justify">Poderia ser feita uma versão web do sistema para ficar de acesso mais fácil a diversos tipo de empresas;</p>