package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrade() {
        return grades;

    }

    public void addGrade(int grade){
        grades.add(grade);
    }


    public double getGradeAverage() {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>()

        Student student = new Student("Emily");

        student.getGrade();
        student.addGrade(99);
        student.addGrade(88);
        student.addGrade(75);
        student.addGrade(88);
        student.grades.size();
        System.out.println(student.name + " " + student.grades.size() + " Grades:  " + student.getGrade() + " Average: " + student.getGradeAverage());


    }



}
