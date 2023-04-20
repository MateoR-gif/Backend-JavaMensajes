import java.sql.Connection;
public class Main {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.GetConnection()){
            System.out.println("Conexión exitosa a la base de datos: " + cnx);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}