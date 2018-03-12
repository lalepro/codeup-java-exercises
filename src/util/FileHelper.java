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

public class FileHelper {
    private String directory;
    private String filename;

    public static void main(String[] args){
        List<String> test = new ArrayList<>();
        test.add("cat");
        test.add("dog");

        System.out.println(slurp("src/grades/GradesApplication.java"));
        spit("README.md", test);
        makeExciting("README.md");
//        System.out.println(makeExciting("output.txt"));
    }


    public FileHelper(String directory, String filename) {
        this.directory = directory;
        this.filename = filename;
    }




    public static List<String> slurp(String filename){
        List<String> result = null;
        try {
            result = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void spit(String filename, List<String> contents){
        Path path = Paths.get(filename);
        if(Files.notExists(path)){
            try {
                Files.write(path,contents);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(Files.exists(path)){
            System.out.println("File already exists.");
        }
    }

    public static void spit(String filename, List<String> contents, boolean append){
        Path path = Paths.get(filename);
        if(Files.notExists(path)){
            try {
                Files.write(path,contents, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(Files.exists(path)){
            System.out.println("File already exists.");
        }
    }

    public static void makeExciting(String filename){
        List<String> contents = slurp(filename);
        for (String content : contents){
            String capitalizeContent = (content.toUpperCase());
            System.out.println(capitalizeContent);
        }
        try {
            Files.write(Paths.get(filename), contents);
        } catch (IOException e) {
            System.out.println("Error while making something exciting.");
            e.printStackTrace();
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