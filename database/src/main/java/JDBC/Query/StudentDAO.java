package JDBC.Query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public List<Student> list() {

        List<Student> students = new ArrayList<>();


        try (Connection conn = ConnectionFactory.getConnection()) {

            PreparedStatement prst = conn.prepareStatement("SELECT * FROM student");

            ResultSet rs = prst.executeQuery();

            while (rs.next()) {
                Student student = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("state")
                );

                students.add(student);
            }

        } catch (Exception e) {

        }

        return students;
    }
}
