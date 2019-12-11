package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Quemuel
 */
public class DBconnect {
           
    public static Connection Connect() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/gym_management","gym","gym");            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERRO: Não foi possível conectar à base de dados" + e.getMessage());
            return null;
        }
        
    }
    
     public static void Disconnect(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("ERRO: Não foi possível desconectar da base de dados" + e.getMessage());
        }
    }
}
