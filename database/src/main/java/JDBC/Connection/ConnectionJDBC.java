package JDBC.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args) throws SQLException {

        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";

        try (Connection conn = DriverManager.getConnection(urlConnection, "root", "password")){
            System.out.println("The Connection has been Made");
        } catch (Exception e) {
            System.out.println("The Connection has Failed");
        }

//        A better way to do it, is to declare variables in another file
//        in order to create the string of connectionUrl as bellow:

//        String driver = "mysql";
//        String dataBaseAddress = "localhost";
//        String dataBaseName = "digital_innovation_one";
//        String user = "root";
//        String password = "password";
//
//        StringBuilder sb = new StringBuilder("jdbc:")
//                .append(driver).append("://")
//                .append(dataBaseAddress).append("/")
//                .append(dataBaseName);
//
//        String connectionUrl = sb.toString();
//
//        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)){
//            System.out.println("The Connection has been Made");
//        } catch (Exception e) {
//            System.out.println("The Connection has Failed");
//        }
    }
}
