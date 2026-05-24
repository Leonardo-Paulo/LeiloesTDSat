/*package default.java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Adm
 */

public class conectaDAO {
    
    public Connection connectDB(){
        Connection conn = null;

        try {

            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/leiloes_db",
                "root",
                "435leo435MYSQL@"
            );

            System.out.println("Conectado!");

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());

        }

        return conn;
    }
}