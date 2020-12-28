package SortingAndFilters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class YearEndUniform {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer students = Integer.parseInt(br.readLine());

        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < students; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<String> studentsName = new ArrayList<>();
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            List<String> uniforms = new ArrayList<>();

            while (st.hasMoreTokens()) {
                studentsName.add(st.nextToken());
            }

            while (st2.hasMoreTokens()) {
                uniforms.add(st2.nextToken());
            }
            Student student = new Student();

            student.setColor(uniforms.get(0));
            student.setSize(uniforms.get(1));
            student.setName(studentsName.stream().collect(Collectors.joining(" ")));

            studentsList.add(student);
        }

        studentsList.sort(Comparator.comparing(Student::getColor)
                .thenComparing(Comparator.comparing(Student::getSize).reversed()
                        .thenComparing(Student::getName)));

        studentsList.forEach(student -> {
            String feio = student.getColor() + " " + student.getSize() + " " + student.getName();
//            String feio2 = student.getColor().concat(" ").concat(student.getSize().concat(" ").concat(student.getName()));
            System.out.println(feio);
//            System.out.println("**********");
//            System.out.println(feio2);
        });

    }

    public static class Student {
        private String color;
        private String size;
        private String name;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "color='" + color + '\'' +
                    ", size='" + size + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}