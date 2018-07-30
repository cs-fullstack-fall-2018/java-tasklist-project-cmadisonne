import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Congratulations!! You're running Lotus's Task List Program.");
        taskselection();
        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.nextLine();

        while (!userInput.equals("q")) {
            if (userInput.equals("1")) {
                selection1();
                taskselection();
                continue;
            } else if (userInput.equals("2")) {
                selection2();
                taskselection();
                continue;
            } else if (userInput.equals("3")) {
                selection3();
                taskselection();
                continue;
            }
            break;
        }
    }

    public static void taskselection(){
        ArrayList<String> taskList = new ArrayList<String>();
        taskList.add("What would you like to do?");
        taskList.add("1. List All Tasks.");
        taskList.add("2. Add a task to the list.");
        taskList.add("3. Delete a task.");
        taskList.add("q. To quit the program.");
        for (String commands : taskList) {
            System.out.println(commands);
        }
        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.nextLine();
    }

    public static void selection1() {
        ArrayList<String> newTasklist = new ArrayList<String>();
        System.out.println(newTasklist);
    }

    public static void selection2() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What would you like to add?");
        String userInput = keyboard.nextLine();
        System.out.println(keyboard.nextLine());
        ArrayList<String> newTasklist = new ArrayList<String>();
        newTasklist.add(userInput);
    }

    public static void selection3(){
        System.out.println("What would you like to remove?");
        Scanner keyboard = new Scanner(System.in);
        String userInput = keyboard.nextLine();
        System.out.println(keyboard.nextLine());
        ArrayList<String> newTasklist = new ArrayList<String>();
        newTasklist.remove(userInput);
    }
}