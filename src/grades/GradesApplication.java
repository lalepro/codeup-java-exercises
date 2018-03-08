package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student student = new Student("Dave");
        Student student1 = new Student("Sheri");
        student.addGrade(88);
        student1.addGrade(99);
        students.put("davey77", student);
        students.put("sheri99", student1);
//        System.out.println(students.getOrDefault(5));





    }
}
