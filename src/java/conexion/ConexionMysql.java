/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;

/**
 *
 * @author Ale
 */
public class ConexionMysql {
    public static String url="jdbc:mysql://localhost:3306/gestionabogados";
    public static String user="root";
    public static String pass="dad931106";
    public static String msj="";
    
    public Connection Conectar(){
        Connection link=null;
        try {
               Class.forName("com.mysql.jdbc.Driver");
               link=DriverManager.getConnection(url,user,pass);
            } catch (Exception e) {
                ConexionMysql.msj=e.getMessage();//debe ser el mismo nombre de la calse
            }
            return link;
    }
}
