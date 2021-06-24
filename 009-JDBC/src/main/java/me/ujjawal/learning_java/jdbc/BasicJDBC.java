package me.ujjawal.learning_java.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class BasicJDBC {

    private static final Logger LOGGER = LogManager.getLogger(BasicJDBC.class);

    static final String DB_URL = "jdbc:postgresql://192.168.1.69:2006/radon_test";
    static final String USER = "postgres";
    static final String PASS = "root123";
    static final String QUERY = "SELECT id, name, email, phone, city FROM employee";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                StringBuffer output = new StringBuffer();
                output.append("ID: ").append(rs.getInt("id"));
                output.append(", Name: ").append(rs.getString("name"));
                output.append(", Email: ").append(rs.getString("email"));
                output.append(", Phone: ").append(rs.getString("phone"));
                output.append(", City: ").append(rs.getString("city"));
                LOGGER.info(output.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
