package JDBC.Query;

import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();

        List<Student> students = studentDAO.list();

        students.stream().forEach(System.out::println);
    }
}
