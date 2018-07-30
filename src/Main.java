import java.util.ArrayList;
import java.util.Scanner;

/*
    This program will allow the user to create and maintain a simple list of tasks/ToDos

    The current list of tasks will be maintained in an array list.

    Depending on the operation selected, the program will pass the current list of tasks
    to the proper method which will perform the requested action (List, Add new task, Delete existing task)

    We reuse the listAllTasks() method after every add or delete to show the updated list for convenience to the user

 */
public class Main {

    public static void main(String[] args) {

        // Let's define the Scanner to get the input, and the array list to store our tasks
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> arrayOfTasks = new ArrayList<String>(); // This array will hold our tasks

        // Display a welcome message (once)
        System.out.println("Congratulations!! You're running Lotus's Task List Program.");

        // Now keep getting menu selections and working with tasks until user quits (q)
        // We will use this to get a selection from the menu
        String userInput = "";
        while (!userInput.equals("q")) { // First time userInput will equal "" (see above when we create variable)
            System.out.println("What would you like to do?");
            System.out.println("1. List All Tasks.");
            System.out.println("2. Add a task to the list.");
            System.out.println("3. Delete a task.");
            System.out.println("q. To quit the program.");
            userInput = keyboard.nextLine();
            if (userInput.equals("1")) { // Call the list tasks method with the current list of tasks
                listAllTasks(arrayOfTasks);
            } else if (userInput.equals("2")) { // Call the add new task method with the current list of tasks
                addNewTask(arrayOfTasks);
            } else if (userInput.equals("3")) { // Call the delete task method with the current list of tasks
                deleteTask(arrayOfTasks);
            }
        }
    }


    // This method will list out the current list of tasks in our array that is passed in
    // If the task list is empty (size()==0) we display a message
    public static void listAllTasks(ArrayList<String> currentListOfTasks) {
        if (currentListOfTasks.size() == 0) {
            System.out.println("No Tasks in List to Display!\n"); // The task list is empty
        } else {
            System.out.println("* Current List of Tasks *");
            int taskNumber = 0; // Will print a simple task ID for each task for convenience
            for (String myTask : currentListOfTasks) {
                System.out.println(taskNumber + ". " + myTask); // Print task index and task text
                taskNumber++;
            }
            System.out.println("\n"); // Print an extra blank line just to display better
        }
    }

    // This method will add a new task to the current list of tasks in our array that is passed in
    public static void addNewTask(ArrayList<String> currentListOfTasks) {
        Scanner keyboardGetNewTask = new Scanner(System.in);
        System.out.println("What would you like to add?");
        String newTask = keyboardGetNewTask.nextLine();
        currentListOfTasks.add(newTask);
        System.out.println("New Task Added!\n");
        listAllTasks(currentListOfTasks); // List the current task list with the newly added task
    }

    // This method will let the user delete an existing task from the list
    // If there are no tasks available to delete (list is empty) it just returns
    // NOTE: Not checking to make sure the user enters a valid index before trying to delete, but you could and probably should :-)
    public static void deleteTask(ArrayList<String> currentListOfTasks) {
        if (currentListOfTasks.size() == 0) {
            System.out.println("No Tasks in list to Delete!\n"); // Nothing to see here. bail
            return;
        }

        listAllTasks(currentListOfTasks); // List current tasks so they can see the index numbers
        System.out.print("Enter Index Number of Task to Remove: "); // Prompt for which one to remove
        Scanner keyboardGetTaskToDelete = new Scanner(System.in);
        int deleteTaskNmber = keyboardGetTaskToDelete.nextInt(); // Get index of task to delete from user
        currentListOfTasks.remove(deleteTaskNmber);
        System.out.println("Task Deleted!\n");
        listAllTasks(currentListOfTasks); // List the current task list with the selected task deleted
    }
}
