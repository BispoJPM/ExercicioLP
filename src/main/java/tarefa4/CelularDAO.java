package tarefa4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CelularDAO {

    private String url = "jdbc:mysql://localhost:3306/Celular"; // para entrar no banco
    private String usuario = "root";
    private String senha = "porygon";

    // Método para cadastrar um novo celular
    public void cadastrarCelular(String marca, int cameras, String cor) {
        String sql = "INSERT INTO celular (marca, cameras, cor) VALUES (?, ?, ?)"; // para pegar os valores, o ? é o valor

        try {
            // Carregar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tentar a conexão com o banco de dados
            try (Connection conn = DriverManager.getConnection(url, usuario, senha);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setString(1, marca);
                pstmt.setInt(2, cameras);
                pstmt.setString(3, cor);

                int rowsAffected = pstmt.executeUpdate();
                System.out.println("Rows affected: " + rowsAffected);

            } catch (SQLException e) {
                System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
        }
    }

    // Método para excluir um celular pelo ID
    public void excluirCelular(int id) {
        String sql = "DELETE FROM celular WHERE id = ?";

        try {
            // Carregar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tentar a conexão com o banco de dados
            try (Connection conn = DriverManager.getConnection(url, usuario, senha);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setInt(1, id);

                int rowsAffected = pstmt.executeUpdate();
                System.out.println("Rows affected: " + rowsAffected);

            } catch (SQLException e) {
                System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
        }
    }
}
