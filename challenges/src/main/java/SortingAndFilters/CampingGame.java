package SortingAndFilters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CampingGame {

    static class Student {
        String name;
        Integer token;

        public Student() {
            this.name = name;
            this.token = token;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", token=" + token +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer studentsAmount =  Integer.parseInt(br.readLine());
        String winner;

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < studentsAmount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<String> studentsInfo = new ArrayList<>();

            while (st.hasMoreTokens()) {
                studentsInfo.add(st.nextToken());
            }

            Student student = new Student();

            student.name = studentsInfo.get(0);
            student.token = Integer.parseInt(studentsInfo.get(1));

            studentList.add(student);

            

            System.out.println("Vencedor(a): " + winner);

        }
    }
}
