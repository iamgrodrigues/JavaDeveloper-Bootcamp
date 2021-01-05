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

            String sql = "SELECT * FROM student";

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

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
            System.out.println("The List has Failed");
            e.printStackTrace();
        }

        return students;
    }

    public Student getById(int id) {

        Student student = new Student();

        try (Connection conn = ConnectionFactory.getConnection()) {

            String sql = "SELECT * FROM student WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setState(rs.getString("state"));
            }

        } catch (Exception e) {
            System.out.println("The List has Failed");
            e.printStackTrace();
        }

        return student;
    }

    public void create(Student student) {

        try (Connection conn = ConnectionFactory.getConnection()) {

            String sql = "INSERT INTO student(name, age, state) VALUES(?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, student.getName());
            stmt.setInt(2, student.getAge());
            stmt.setString(3, student.getState());

            int rowsAffected = stmt.executeUpdate();

            System.out.println("Insert Succeeded!. " + rowsAffected + " line(s) has/have been added");

        } catch (Exception e) {
            System.out.println("Insert has Failed");
            e.printStackTrace();
        }
    }

    public void delete(int id) {

        try (Connection conn = ConnectionFactory.getConnection()) {

            String sql = "DELETE FROM student WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();

            System.out.println("Delete Succeeded!. " + rowsAffected + " line(s) has/have been deleted");

        } catch (Exception e) {
            System.out.println("Delete has Failed");
            e.printStackTrace();
        }
    }

    public void update(Student student) {

        try (Connection conn = ConnectionFactory.getConnection()) {

            String sql = "UPDATE student SET name = ?, age = ?, state = ? WHERE id = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, student.getName());
            stmt.setInt(2, student.getAge());
            stmt.setString(3, student.getState());
            stmt.setInt(4, student.getId());

            int rowsAffected = stmt.executeUpdate();

            System.out.println("Update Succeeded!. " + rowsAffected + " line(s) has/have been updated");

        } catch (Exception e) {
            System.out.println("Update has Failed");
            e.printStackTrace();
        }
    }
}
