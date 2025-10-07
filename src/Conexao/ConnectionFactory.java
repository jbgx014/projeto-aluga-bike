/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao; //criação do pacote para a conexão com banco de dados
import java.sql.*;


/**
 *
 * @author juuh2
 */
public class ConnectionFactory {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/alugabiken"; //link de conexão com o banco de dados
    
    public static Connection createConnectionToMySql() throws Exception{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
       return connection;
    }
}


    /*
    public static void main(String[] args ) throws Exception {
        Connection con = createConnectionToMySql();
        if (con != null) {
            System.out.println("obtida a conexao");
            con.close();
        } else {
            System.out.println("problema com a conexao");
        }
    }
}
*/
