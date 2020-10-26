package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gabriel de Moraes Torres
 * 
 */

public class ConexaoDAO {

    public Connection conexao;

    public ConexaoDAO() {
        carregarDriver();
    }

    public void carregarDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao carregar o driver");
        }
    }

    public Connection obterConexao() {
        try {
            String host = "jdbc:mysql://localhost:3306/rtc";
            String usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(host, usuario, senha);
            System.out.println("Conectado ao BD com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro de conexao com o BD");
            System.out.println(e.getMessage());
        }
        return conexao;
    }
}
