import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) throws SQLException {
        // JDBC URL, username, password for your MySQL database
        String jdbcURL = "jdbc:mysql://localhost:3306/sakila";
        String dbUser = "root";
        String dbPassword = "Irfan@2000";

        // Insert query
        String insertQuery = "INSERT INTO Employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";

        try {
            // Establish connection
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            // Prepare the insert statement
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // Inserting first employee
            preparedStatement.setInt(1, 101);
            preparedStatement.setString(2, "Jenny");
            preparedStatement.setInt(3, 25);
            preparedStatement.setDouble(4, 10000);
            preparedStatement.executeUpdate();

            // Inserting second employee
            preparedStatement.setInt(1, 102);
            preparedStatement.setString(2, "Jacky");
            preparedStatement.setInt(3, 30);
            preparedStatement.setDouble(4, 20000);
            preparedStatement.executeUpdate();

            // Inserting third employee
            preparedStatement.setInt(1, 103);
            preparedStatement.setString(2, "Joe");
            preparedStatement.setInt(3, 20);
            preparedStatement.setDouble(4, 40000);
            preparedStatement.executeUpdate();

            // Inserting fourth employee
            preparedStatement.setInt(1, 104);
            preparedStatement.setString(2, "John");
            preparedStatement.setInt(3, 40);
            preparedStatement.setDouble(4, 0); // Salary is missing; set to 0 or handle accordingly
            preparedStatement.executeUpdate();

            // Inserting fifth employee
            preparedStatement.setInt(1, 105);
            preparedStatement.setString(2, "Shameer");
            preparedStatement.setInt(3, 25);
            preparedStatement.setDouble(4, 90000);
            preparedStatement.executeUpdate();

            System.out.println("Employee records inserted successfully!");

            // Close connection
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }
}


