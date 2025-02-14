package projekt;
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    private static ArrayList<String> toDoList = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the To-Do List App!");

        do {
            showMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the app. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }

        } while (choice != 4);

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n--- To-Do List Menu ---");
        System.out.println("1. Add a Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Remove a Task");
        System.out.println("4. Exit");
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter the task to add: ");
        String task = scanner.nextLine();
        toDoList.add(task);
        System.out.println("Task added successfully.");
    }

    private static void viewTasks() {
        if (toDoList.isEmpty()) {
            System.out.println("Your To-Do List is empty.");
        } else {
            System.out.println("\nYour Tasks:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }

    private static void removeTask(Scanner scanner) {
        viewTasks();
        if (!toDoList.isEmpty()) {
            System.out.print("Enter the task number to remove: ");
            int taskIndex = scanner.nextInt() - 1;

            if (taskIndex >= 0 && taskIndex < toDoList.size()) {
                String removedTask = toDoList.remove(taskIndex);
                System.out.println("Removed task: " + removedTask);
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }
}
