/**
 * Challenge
 *
 * Professor Girafales organized the uniform making for the school's classes to celebrate the end of the year.
 * After some meetings, it was agreed that the students could choose their uniform color between white and red.
 * Therefore, Girafales needs your help to organize the lists with who wants the uniform on each class, relating those
 * uniforms by color, size (S, M or L), and by the student's name.
 *
 *
 * Input
 *
 * Each case would have a value N(1 ≤ N ≤ 60) integer and positive, which N means the amount of uniforms to be made
 * to that class. On the next 2 lines you will have the uniform's information,
 * the first line will give the student's name, the second line will have the uniform's color ("white" or "red")
 * and then followed by blank space the uniform's size ("S", "M" or "L"). The input will finish after N == 0 and
 * this value should be ignored.
 *
 *
 * Output
 *
 * For each input case you should print the data sorted by color in ascending order, size in descending order and
 * last the student's name should sort in ascending order, as shown in the example below:
 *
 *
 * -------------------------------------------------------------------------
 * | input example                  | output example                       |
 * |--------------------------------|--------------------------------------|
 * |        9                       |                                      |
 * |        Maria Jose              |        Red S Amaro Dinha             |
 * |        White S                 |        Red S Baka Lhau               |
 * |        Mangojata Mancuda       |        Red S Carlos Chade Losna      |
 * |        Red S                   |        Red S Mangojata Mancuda       |
 * |        Cezar Torres Mo         |        White S Cezar Torres Mo       |
 * |        White S                 |        White S Maria Jose            |
 * |        Baka Lhau               |        White M Juju Mentina          |
 * |        Red S                   |        White L Adabi Finho |         |
 * |        Juju Mentina            |        White L Severina Rigudinha    |
 * |        White M                 |                                      |
 * |        Amaro Dinha             |                                      |
 * |        Red S                   |                                      |
 * |        Adabi Finho             |                                      |
 * |        White L                 |                                      |
 * |        Severina Rigudinha      |                                      |
 * |        White L                 |                                      |
 * |        Carlos Chade Losna      |                                      |
 * |        Red S                   |                                      |
 * |                                |                                      |
 * -------------------------------------------------------------------------
 *
 **/

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
            String uniformList = student.getColor() + " " + student.getSize() + " " + student.getName();
//            String uniformList = student.getColor().concat(" ").concat(student.getSize().concat(" ").concat(student.getName()));
            System.out.println(uniformList);
//            System.out.println(uniformList);
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