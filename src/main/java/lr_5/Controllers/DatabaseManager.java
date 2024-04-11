package lr_5.Controllers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import lr_5.Models.Sex;
import lr_5.Models.Student;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/UniversityDatabase";
    private static final String USER = "";  // personal data
    private static final String PASSWORD = ""; // personal data
    private static Connection connection;

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        if(!connection.isClosed()) {
            System.out.println("The connection to the database is established.");
        }
    }

    public List<Student> getAllStudents() throws SQLException {
        String sqlQuery = "SELECT * FROM students";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {
            return getStudents(resultSet);
        }
    }

    public List<Student> getStudentsBySex(Sex sex) throws SQLException {
        String sqlQuery = "SELECT * FROM students WHERE sex = ?";

        try (PreparedStatement statement = connection.prepareStatement(sqlQuery)) {
            statement.setInt(1, sex.ordinal());
            try (ResultSet resultSet = statement.executeQuery()) {
                return getStudents(resultSet);
            }
        }
    }

    private Student createStudent(ResultSet resultSet) throws SQLException {
        return new Student(
                resultSet.getString("name"),
                resultSet.getString("surname"),
                resultSet.getString("patronymic"),
                Sex.values()[resultSet.getInt("sex")],
                resultSet.getInt("id")
        );
    }

    private List<Student> getStudents(ResultSet resultSet) throws SQLException {
        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            students.add(createStudent(resultSet));
        }
        return students;
    }

    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("The connection to the database is closed.");
        }
    }
}
