/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//Importamos el paquete java.sql para uasar oracl y su conector
import java.sql.*;
public class ModeloConexion {
    
    public static Connection conectarse(String login, String password) throws Exception{
        
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection(url, login, password);
        return con;
    }

    Connection conectarse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
