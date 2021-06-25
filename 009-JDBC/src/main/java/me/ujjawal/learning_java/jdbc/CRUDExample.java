package me.ujjawal.learning_java.jdbc;

import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * CRUD, DDL, DML
 */
public class CRUDExample {
    private static final Logger LOGGER = LogManager.getLogger(BasicJDBC.class);

    static final String DB_URL = "jdbc:postgresql://192.168.1.69:2006/radon_test";
    static final String USER = "postgres";
    static final String PASS = "root123";

    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();

        LOGGER.info(employeeDao.getAll());

        LOGGER.info(employeeDao.getById(1));
        LOGGER.info(employeeDao.getById(10));

        Employee test = new Employee();
        test.setName("Test");
        test.setEmail("test@test.com");
        test.setPhone("9988776655");
        test.setCity("Bokaro");
        boolean saved = employeeDao.save(test);
        LOGGER.info("saved --> " + saved);
        LOGGER.info(test);

    }

    @Data
    static class Employee {
        private Integer id;
        private String name;
        private String email;
        private String phone;
        private String city;
    }

    static class EmployeeDao {

        List<Employee> getAll() {
            List<Employee> employeeList = new ArrayList<>();
            final String query = "select * from employee";
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);) {
                // Extract data from result set
                while (rs.next()) {
                    Employee employee = toEmployee(rs);
                    employeeList.add(employee);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return employeeList;
        }

        Employee getById(Integer id) {
            Employee employee = null;
            final String query = "select * from employee where id = ?";
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement preparedStatement = conn.prepareStatement(query)) {
                preparedStatement.setInt(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                // Extract data from result set
                if (rs.next()) {
                    employee = toEmployee(rs);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return employee;
        }

        boolean save(Employee employee) {
            boolean saved = false;
            try {
                //UPSERT
                saved = exists(employee) ? update(employee) : insert(employee);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return saved;
        }

        private boolean insert(Employee employee) throws SQLException {
            boolean inserted = false;
            Integer id = getNextId();
            final String query = "insert into employee(id, name, email, phone, city) values (?,?,?,?,?)";
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement preparedStatement = conn.prepareStatement(query)) {
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, employee.getName());
                preparedStatement.setString(3, employee.getEmail());
                preparedStatement.setString(4, employee.getPhone());
                preparedStatement.setString(5, employee.getCity());
                int numInserts = preparedStatement.executeUpdate();
                inserted = 0 < numInserts;
                if (inserted) {
                    employee.setId(id);
                }
            }
            return inserted;
        }

        private boolean update(Employee employee) throws SQLException {
            boolean updated = false;
            final String query = "update employee set name=?, email=?, phone=?, city=? where id=?";
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement preparedStatement = conn.prepareStatement(query)) {
                preparedStatement.setString(1, employee.getName());
                preparedStatement.setString(2, employee.getEmail());
                preparedStatement.setString(3, employee.getPhone());
                preparedStatement.setString(4, employee.getCity());
                preparedStatement.setInt(5, employee.getId());
                int numUpdates = preparedStatement.executeUpdate();
                updated = 0 < numUpdates;
            }
            return updated;
        }

        private Integer getNextId() throws SQLException {
            Integer id = null;
            final String query = "select nextval('employee_id_seq')";
            try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(query)) {
                // Extract data from result set
                if (rs.next()) {
                    id = rs.getInt(1);
                }
            }
            return id;
        }

        private boolean exists(Employee employee) {
            return null != employee && null != employee.getId() && 0 < employee.getId();
        }

        private Employee toEmployee(ResultSet rs) throws SQLException {
            // Retrieve by column name
            Employee employee = new Employee();
            employee.setId(rs.getInt("id"));
            employee.setName(rs.getString("name"));
            employee.setEmail(rs.getString("email"));
            employee.setPhone(rs.getString("phone"));
            employee.setCity(rs.getString("city"));
            return employee;
        }
    }
}
