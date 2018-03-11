package myStudyCorner;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingFiles {
    public static void main(String[] args) throws IOException {
//        File myFile = new File("output.txt");

//Writing a file:
//        File output = new File("output.txt");
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(output);
//            BufferedWriter buf = new BufferedWriter(writer);
//
//            buf.write("This is written by a program, hell yeah! \n");
//            buf.write("The Full path of this file is: " + output.getAbsolutePath());
//            buf.write("\n Hello from my new Directory: " + output.getParentFile());
//
//            buf.flush();
////            flush method forces any unwritten data to be written, then close it.
//            buf.close();
//            System.out.println("it has been written");
//        } catch (IOException e) {
//            System.err.println("Something went wrong");
////            e.printStackTrace();
//        }
    String directory = "fooYou";
    String filename = "output.txt";
    Path dataDirectory = Paths.get(directory);
    Path dataFile = Paths.get(directory, filename);

    if(Files.notExists(dataDirectory)){
        Files.createDirectories(dataDirectory);
    }
    if (! Files.exists(dataFile)){
        Files.createFile(dataFile);
    }

//    Path Files.write(Path filepath, List<String> lines [, StandardOpenOption option])
//        List<String> Files.readAllLines(Path filepath)

    List<String> groceryList = Arrays.asList("coffee", "Milk", "sugar");
    Files.write(Paths.get("data", "output.txt"), groceryList);

//        Reading a file
        List<String> lines = Files.readAllLines(Paths.get("output.txt"));
//        File input = new File("output.txt");

//        try {
//            FileReader reader = new FileReader(input);
//            BufferedReader buf = new BufferedReader(reader);
//
//            String firstLine = buf.readLine();
//            String secondLine = buf.readLine();
//            String thirdLine = buf.readLine();
//
//            buf.close();
//            System.out.println(firstLine + "\n" + secondLine + "\n" + thirdLine);
//        } catch (IOException e) {
//            System.err.println("Error! Doomsday");
////            e.printStackTrace();
//        }


//        if(!myFile.exists()) System.out.println("File does not exist");
//        else System.out.println("File Exists!");
//        String fullPath = myFile.getAbsolutePath();
//        System.out.println(fullPath);
//        System.out.println(myFile.toString());
//        System.out.println("File name: " + myFile.getName());
//        System.out.println("Is Directory: " + myFile.isDirectory());
//        System.out.println("Exists: " + myFile.exists() + ". Will return True, if a output.txt or file is made.");
//        System.out.println("Can Execute: " + myFile.canExecute());
//        System.out.println("To String: " + myFile.toString());
//        System.out.println("Parent: " + myFile.getParent());
//        System.out.println("Can Read: " + myFile.canRead());
//        System.out.println("Can Write: " + myFile.canWrite());
//        System.out.println("Equals: " + myFile.equals(myFile));
//        System.out.println("Is Absolute:  " + myFile.isAbsolute());
//        System.out.println("Is File: " + myFile.isFile());
//        System.out.println("Hash Code: " + myFile.hashCode());
//        System.out.println("Absolute File: " + myFile.getAbsoluteFile());
//        System.out.println("Absolute Path: " + myFile.getAbsolutePath());
//        System.out.println("Full Path: " + fullPath);
//        System.out.println("Canonical File: " + myFile.getCanonicalFile());
//        System.out.println("Canonical Path: " + myFile.getCanonicalPath());
    }
}
