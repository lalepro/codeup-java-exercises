package myStudyCorner;

import util.FileHelper;
import util.Input;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class UsingFiles {
    private static List<String> friends = FileHelper.slurp("src/friends.txt");
    static Input ul = new Input();
    public static void main(String[] args) throws IOException {
        System.out.println("| Welcome to Contacts Manager |\n");
        contactOption();
    }
    public static void contactOption() {

    int userInput;
    do{
    System.out.println(
        " ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
        "| 1 View Contacts             |\n" +
        "| 2 Add a new Contact         |\n" +
        "| 3 Search a Contact by Name  |\n" +
        "| 4 Delete an Existing Contact|\n" +
        "| 5 Exit                      |\n" +
        " ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    userInput = ul.getInt("Pick an Option");
        switch (userInput) {
            case 1:
                viewContacts();
                break;
            case 2:
//                String name = ul.getString("Enter Name: ");
//                String number= ul.getString("Enter Number: ");
//                addContact(name, number);
                newContact();
                break;
            case 3:
                searchByName();
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Not an Option, TRY AGAIN");

        }

    }while (userInput != 5) ;
        System.out.println("Goodbye");

}

    public static void addContact(String name, String number) {
        friends = new ArrayList<>();
        Friend friend = new Friend(name, number);
        friends.add(friend.getName() + " " + friend.getNumber());
        FileHelper.spit("src/friends.txt", friends, true);
    }

    public static void newContact(){
        String enterName = ul.getString("Enter Name: ");
        String enterNumber = ul.getString("Enter Number: ");
        addContact(enterName, enterNumber);
    }

    public static void viewContacts(){
        List<String> files = null;
        try {
            files = readAllLines(Paths.get("src", "friends.txt"));
        } catch (IOException e) {
            System.out.println("ERROR 404 - FILE NOT FOUND");
            System.exit(1);
        }
        for (int i = 0; i < files.size(); ++i) {
            String line = files.get(i);
            System.out.printf("%s: %s\n", i + 1, line);
        }

    }

//    public static void searchByName(String name) {
//
//      for(Friend friend : friends){
//          if(friend.getName().equalsIgnoreCase(name)){
//              System.out.println(friend.getName());
//              System.out.println(friend.getNumber());
//          }
//      }
//






     }
   














}










//        File myFile = new File("output.txt");

//Writing a file:
//        File output = new File("output.txt");
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(output);
//            BufferedWriter buf = new BufferedWriter(writer);
//
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
//        HashMap<String, Integer> friends = new HashMap<>();
//    Friend friend = new Friend("Lucy", 2028675309);
//
//    String directory = "fooYou";
//    String filename = "output.txt";
//    Path dataDirectory = Paths.get(directory);
//    Path dataFile = Paths.get(directory, filename);
//
//    if(Files.notExists(dataDirectory)){
//        Files.createDirectories(dataDirectory);
//    }
//    if (! Files.exists(dataFile)){
//        Files.createFile(dataFile);
//    }

//    Path Files.write(Path filepath, List<String> lines [, StandardOpenOption option])
//        List<String> Files.readAllLines(Path filepath)
//
//    List<String> groceryList = Arrays.asList("coffee", "Milk", "sugar");
//    Files.write(Paths.get("data", "output.txt"), groceryList);
//        Path path = Paths.get("src", "util", "Input.java");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());
//        System.out.println(Files.exists(Paths.get("src", "non-exist.java")));
//        create a file
//        Files.createFile(Paths.get("README.md"));
//        ArrayList<String> readmeContents = new ArrayList<>();
//        readmeContents.add("Teddy Java Exercises");
//        readmeContents.add("");
//        readmeContents.add("This is a place to add information");
//
//        Files.write(
//                Paths.get("README.md"),
//                readmeContents,
//                StandardOpenOption.APPEND);
//
//
//        List<String> readme = Files.readAllLines(Paths.get("README.md"));
//        ArrayList<String> lowerCasedReadme = new ArrayList<>();
//
//        for (String line : readme){
//            lowerCasedReadme.add(line.toUpperCase());
//        }
//        Files.write(Paths.get("README-lowercased.md"), lowerCasedReadme);
//        for (int i = 0; i < bobClass.size(); i++) {
//            String line = bobClass.get(i);
//            System.out.printf("%s: %s\n", i + 1, line);
//        }
//
//        System.out.println(bobClass);

////        Reading a file
//        List<String> lines = Files.readAllLines(Paths.get("output.txt"));
//
//        Path groceriesPath = Paths.get("data", "groceries.txt");
//
//        List<String> groceryList = Files.readAllLines(groceriesPath);
//        for (int i = 0; i < groceryList.size(); i += 1) {
//            System.out.println((i + 1) + ": " + groceryList.get(i));
//        }
//
//
//        Files.write(
//                Paths.get("data", "groceries.txt"),
//                Arrays.listOf("eggs"), // list with one item
//                StandardOpenOption.APPEND
//        );
//        List<String> lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
//        List<String> newList = new ArrayList<>();
//        for (String line : lines) {
//            if (line.equals("milk")) {
//                newList.add("cream");
//                continue;
//            }
//            newList.add(line);
//        }
//        Files.write(newList, lines);
//        File input = new File("output.txt");
//
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