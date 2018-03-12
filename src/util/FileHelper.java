package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class FileHelper {


    public static void main(String[] args){
        List<String> test = new ArrayList<>();
        test.add("cat");
        test.add("dog");
        test.add("you do want another");
        test.add("shark");




        System.out.println(slurp("src/grades/GradesApplication.java"));
//        spit("README.md", test, true);
//        makeExciting("README.md");
//        System.out.println(makeExciting("output.txt"));
//        spit("cat.txt",test, false);
    }




//    public static FileHelper(String directory, String filename) {
//        this.directory = directory;
//        this.filename = filename;
//    }




    public static List<String> slurp(String filename){
        List<String> result = new ArrayList<>();
        try {
            result = readAllLines(Paths.get(filename));
        } catch (IOException e) {
            System.err.printf("Error with SLURP %s: %s\n", filename, e.getMessage());
            System.exit(1);

        }
        return result;
    }

    public static List<String> prettySlurp(String filepath) {
        List<String> files = null;
        try {
            files = readAllLines(Paths.get(filepath));
        } catch (IOException e) {
            System.out.println("ERROR 404 - FILE NOT FOUND");
            System.exit(1);
        }
        for (int i = 0; i < files.size(); ++i) {
            String line = files.get(i);
            System.out.printf("%s: %s\n", i + 1, line);
        }
        return files;
    }


    public static void spit(String filename, List<String> contents, boolean append){
        Path path = Paths.get(filename);
            try {
                if(Files.notExists(path)){
                    Files.createDirectories(path.getParent());
                    Files.createFile(path);
                }
                if(append) {
                    Files.write(path, contents, StandardOpenOption.APPEND);
                }
                else {
                    Files.write(path, contents);
                }
            } catch (IOException e) {
                System.err.println("Error with SPLIT");
//                e.printStackTrace();
            }
    }

    public static void spit(String filename, List<String> contents){
        spit(filename, contents, false);
    }



    public static void makeExciting(String filename){
        List<String> contents = slurp(filename);
        for (String content : contents){
            String capitalizeContent = (content.toUpperCase() + "!");
            System.out.println(capitalizeContent);
        }
        try {
            Files.write(Paths.get(filename), contents);
        } catch (IOException e) {
            System.err.println("Error with MakeExciting");
//            e.printStackTrace();
        }
    }


}



//    File IO Helper Methods
//
//    Create a class named FileHelper inside of util, it should contain the static methods defined below, and should handle any exceptions (i.e. there should not be a throws in either method signature).
//
//        For both methods, if an error is encountered, print out a message explaining what went wrong, then exit the program with the line of code below:
//
//        System.exit(1);
//        Create a method named slurp, it takes a string that is the filepath, and returns a list of strings (the file contents).
//
//        List<String> slurp(String filepath)
//        Create a method named spit, it should accept a filename, and a list of strings that are the contents of the file. It should also accept an optional third boolean argument that is whether or not to append to the file. This method should create the file if it doesn't already exist.
//
//        void spit(String filename, List<String> contents[, boolean append])
//        Write some code that tests both of the methods above by calling them, and checking for the expected result. You might want to create some test files to test these methods as well.
//
//        Create a method named makeExciting. It should accept a string that is a filepath, and uppercase every line, and add a "!" to the end of every line. Test this method by creating a test file and calling your method and passing the path of your test file.
//
//        void makeExciting(String filename)
//        Bonus
//
//        Refactor the error handling in both your methods to instead throw a RuntimeException instead of exiting. What is a benefit of this approach?
//
//        Research how to copy and move files with java, then add the following methods to your FileHelper class:
//
//        void copy(String originalFile, String copyName);
//        void move(String oldPath, String newPath);