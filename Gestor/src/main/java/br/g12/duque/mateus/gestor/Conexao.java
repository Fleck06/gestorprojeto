
package br.g12.duque.mateus.gestor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author 08137
 */
public class Conexao {
    public static final String USERNAME = "root"; //Constante
    public static final String PASSWORD = "usbw"; //Constante
    public static final String DBNAME = "sistema"; // Constante
    public static final String SERVER = "jdbc:mysql://localhost:3306"; //Constante
    
    //Método que realiza a conexão com o banco de dados
    public static Connection getConnection(){
        Connection conn = null;
        String message = "DEU CERTO UHUUL!";
        //Tratamento de exceções em java
        try{
            conn = DriverManager.getConnection(SERVER+"/"+DBNAME, USERNAME, PASSWORD);
        }catch(SQLException ex){
            message = "MANO VAI ESTUDAR SEU FRACASSADO!";
            System.out.println(message);
            ex.printStackTrace();
            
        }
        System.out.println(message);
        return conn;
    }
}
