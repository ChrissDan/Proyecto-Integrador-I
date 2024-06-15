package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {
    public static Connection conectar (){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/bd_sistema_ventas", "root", "Balliforche19");
            return cn;
        } catch(SQLException e){
            System.out.println("Error en la conexion local " + e);
        }
        return null;
    }
}
