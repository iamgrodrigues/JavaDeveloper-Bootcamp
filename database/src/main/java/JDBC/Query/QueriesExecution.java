package JDBC.Query;

import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();

        List<Student> students = studentDAO.list();

        students.stream().forEach(System.out::println);

//        Student studentToSearch = studentDAO.getById(3);

//        System.out.println(studentToSearch);

//        Student studentToInsert = new Student(
//                "Matheus",
//                43,
//                "SP"
//        );

//        studentDAO.create(studentToInsert);

//        studentDAO.delete(1);

//        Student studentToUpdate = studentDAO.getById(3);
//        studentToUpdate.setName("Joaquim");
//        studentToUpdate.setAge(18);
//        studentToUpdate.setState("RS");
//
//        studentDAO.update(studentToUpdate);

    }
}
