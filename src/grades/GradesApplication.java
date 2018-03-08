package grades;

import util.Input;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    static Input ul = new Input();

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student = new Student("Dave");
        student.addGrade(88);
        student.addGrade(99);
        student.addGrade(67);
        student.addGrade(87);
        Student student1 = new Student("Sheri");
        student1.addGrade(99);
        student1.addGrade(85);
        student1.addGrade(95);
        student1.addGrade(83);
        Student student2 = new Student("Bart");
        student2.addGrade(87);
        student2.addGrade(77);
        student2.addGrade(97);
        student2.addGrade(67);
        Student student3 = new Student("Stevie");
        student3.addGrade(93);
        student3.addGrade(92);
        student3.addGrade(90);
        student3.addGrade(92);





        students.put("davey77", student);
        students.put("sheri99", student1);
        students.put("BariWhy69", student2);
        students.put("StveeNicks13", student3);


        System.out.println("Here are the github usernames of our students:");
        int userInput;

        do {
            System.out.println(
                            " _____________________________\n" +
                            "|Welcome:Github Users & Grades|\n" +
                            "| 1 Get info on One Student   |\n" +
                            "| 2 Get info on all Students  |\n" +
                            "| 3 Get out                   |\n" +
                            " -----------------------------");
            userInput = ul.getInt("Pick an Option");
            switch (userInput) {
                case 1:
                    getKey(students);
                    break;
                case 2:
                    getAll(students);
                    break;
                case 3:
                    System.exit(3);
                    break;

            }

        }while (userInput != 3) ;
        System.out.println("Goodbye");

    }



    public static void getKey(HashMap<String, Student> students) {

        for (String userName : students.keySet()){
            System.out.println(userName);
        }
        String input = ul.getString("Which student do you want more info about? ");

        if (students.containsKey(input) ){
            System.out.println("Name: " + students.get(input).getName());
            System.out.println("GitHub username " + input);
            System.out.println("All grades " + students.get(input).getGrade());
            System.out.println("Average grade is " + students.get(input).getGradeAverage());


            input = ul.getString("Would you like to see another student? Type Yes or 0 to exit");
                if(input.equalsIgnoreCase("yes")){
                    getKey(students);
                } else {
                    System.exit(0);
                }

        }
        else {
            input = ul.getString("Unknown Student. Would you like to try again? Yes or 0 to exit");
             if(input.equalsIgnoreCase("yes")){
                 getKey(students);
             } else {
                 System.out.println("Have a wonderful Day");
                 System.exit(0);
             }
        }
        getKey(students);

    }


    public static void getAll(HashMap<String, Student> students) {
        for (String userName : students.keySet()){
        Student eachStudent = students.get(userName);
        System.out.println(eachStudent.getName() + " Grades: " + eachStudent.getGrade() + " Average: " + eachStudent.getGradeAverage());

        }
        String question = ul.getString("Would you like to more information? Yes or 0 to exit");
        if (question.equalsIgnoreCase("yes")){
            getKey(students);
        } else {
            System.out.println("Thank you for visiting");
            System.exit(0);
        }

    }







}

//
//    Create an application for tracking student grades
//
//        For this exercise, create a directory inside of src named grades. Create the classes defined below inside of grades.
//
//        Create a Student class
//
//Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an list of integers. The student class should have a constructor that sets name property, and initializes the grades property as an empty list. The Student class should have the following methods:
//
//
//// returns the student's name
//public String getName();
//// adds the given grade to the grades property
//public void addGrade(int grade);
//// returns the average of the students grades
//public double getGradeAverage();
//        Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
//
//        Create a map for students and Github usernames
//
//        Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students. It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map.
//
//        Be creative! Make up github usernames and grades for your student objects.
//
//        Create the command line interface
//
//Print the list of github usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a github username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.
//
//        After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.
//
//        Example output:
//
//
//        Welcome!
//
//        Here are the github usernames of our students:
//
//        |zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|
//
//        What student would you like to see more information on?
//
//        > pizza
//
//        Sorry, no student found with the gihub username of "pizza".
//
//        Would you like to see another student?
//
//        > y
//
//        What student would you like to see more information on?
//
//        > zgulde
//
//        Name: Zach - Gihub Username: zgulde
//        Current Average: 87.4
//
//        Would you like to see another student?
//
//        > no
//
//        Goodbye, and have a wonderful day!
//        Bonus
//
//        Display all of the student's grades in addition to the grade average
//        Allow the user to view all of the grades for all of the students
//        Next Annotations