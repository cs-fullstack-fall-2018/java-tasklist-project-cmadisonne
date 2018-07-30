import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> currentListOfTasks = new ArrayList<String>();
        System.out.println("Congratulations!! You're running Lotus's Task List Program.");
        String userInput = "";

        while (!userInput.equals("q")) {
            System.out.println("What would you like to do?");
            System.out.println("1. List All Tasks.");
            System.out.println("2. Add a task to the list.");
            System.out.println("3. Delete a task from the list?");
            System.out.println("q. To quit the program");
            userInput = keyboard.nextLine();
            if (userInput.equals("1")) {
                listAllTasks(currentListOfTasks);
            } else if (userInput.equals("2")) {
                addNewTask(currentListOfTasks);
            } else if (userInput.equals("3")) {
                deleteTask(currentListOfTasks);
            }
        }
    }

        public static void listAllTasks (ArrayList < String > currentListOfTasks) {
            if (currentListOfTasks.size() == 0) {
                System.out.println("No Tasks in List to Display!\n");
            } else {
                System.out.println("* Current List of Tasks *");
                int taskNumber = 0;
                for (String myTask : currentListOfTasks) {
                    System.out.println(taskNumber + ". " + myTask);
                    taskNumber++;
                }
                System.out.println("\n");
            }
        }

        public static void addNewTask(ArrayList<String> currentListOfTasks) {
            Scanner keyboardGetNewTask = new Scanner(System.in);
            System.out.println("What would you like to add?");
            String newTask = keyboardGetNewTask.nextLine();
            currentListOfTasks.add(newTask);
            System.out.println("New Task Added!\n");
            listAllTasks(currentListOfTasks);
        }

        public static void deleteTask(ArrayList<String> currentListOfTasks) {
            if (currentListOfTasks.size() == 0) {
                System.out.println("No Tasks in list to Delete!\n");
                return;
            }

            listAllTasks(currentListOfTasks);
            System.out.print("Enter Index Number of Task to Remove: ");
            Scanner keyboardGetTaskToDelete = new Scanner(System.in);
            int deleteTaskNmber = keyboardGetTaskToDelete.nextInt();
            currentListOfTasks.remove(deleteTaskNmber);
            System.out.println("Task Deleted!\n");
            listAllTasks(currentListOfTasks);
        }

}