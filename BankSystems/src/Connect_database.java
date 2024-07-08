//package coneect_database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connect_database {

    public static Connection coneect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cool", "root", "root");
            JOptionPane.showMessageDialog(null, "coneected ");
            return con;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cant connected ");

        }
        return null;
    }

    public static void main(String[] args) {
        Connect_database.coneect();
    }

}
