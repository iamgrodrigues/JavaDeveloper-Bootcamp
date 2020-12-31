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
        List<Student> students = new ArrayList<>();
        Integer studentsAmount;
        Integer currentIndex;
        Integer currentToken;
        Integer looser;

        studentsAmount =  Integer.parseInt(br.readLine());

        while (studentsAmount !=0) {
            for (int i = 0; i < studentsAmount; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                List<String> studentsInfo = new ArrayList<>();

                while (st.hasMoreTokens()) {
                    studentsInfo.add(st.nextToken());
                }

                Student student = new Student();

                student.name = studentsInfo.get(0);
                student.token = Integer.parseInt(studentsInfo.get(1));

                students.add(student);
            }

            currentIndex = 0;
            looser = 0;
            currentToken = Integer.parseInt(String.valueOf(students.get(currentIndex).token));

            for (int i = 0; i < studentsAmount - 1; i++) {
                if (currentToken == 0) {
                    looser = currentIndex;
                } else if (currentToken % 2 == 0) {
                    looser = (students.size() - (currentToken % students.size()) + currentIndex) % students.size();
                    currentToken = Integer.parseInt(String.valueOf(students.get(looser).token));
                    students.remove(Integer.parseInt(String.valueOf(looser)));

                } else if (currentToken % 2 != 0) {
                    looser = (currentToken % students.size() + currentIndex) % students.size();
                    currentToken = Integer.parseInt(String.valueOf(students.get(looser).token));
                    students.remove(Integer.parseInt(String.valueOf(looser)));
                }

                currentIndex = (currentToken % 2 == 0) ?
                        ((looser <= students.size() - 1) ?
                                looser : 0) :
                        ((looser == 0) ? (students.size() - 1) : (looser - 1));
            }

            System.out.println("Vencedor(a): " + students.get(0).name);
            students.clear();
            studentsAmount = Integer.parseInt(br.readLine());
        }
    }
}
