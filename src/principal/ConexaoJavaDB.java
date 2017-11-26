package principal;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoJavaDB {
    
    ///Permitir somente uma conexão em todo o banco (Singleton)
    ///Tornando uma propriedade de classe
    private static Connection instancia = null;

    public static Connection getConnection() throws Exception {
        if (instancia == null) {
            Class.forName("org.apache.derby.jdbc.ClientDriver");                ///Verifica se o driver do banco está disponível
            String driverURL = "jdbc:derby://localhost:1527/NOME DO BANCO DE DADOS";
            instancia = DriverManager.getConnection(driverURL, "usuario", "senha");        ///Fazendo conexão com o banco de dados
        }
        return instancia;
    }
}
