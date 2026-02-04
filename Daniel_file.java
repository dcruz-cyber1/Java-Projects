/*
 * NAME: Daniel
 * DATE: 10/21/25
 * VERSION: 1
 * SOURCES USED: 
 */

import java.io.*; 
import java.util.*; 

public class Daniel_file {
    
    private static final String File_Name = "task.txt";
    private static final ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) throws IOException { 

        loadTask();
        Scanner sc = new Scanner(System.in); 
        boolean running = true; 
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Hello " + name + "! ");
        
        System.out.print("Do you want to open the task file? (y/n): ");
        String ask = sc.nextLine();
        
        if (ask.equalsIgnoreCase("n")) {
            System.out.println("bye bye");
        } else if (ask.equalsIgnoreCase("y")) {
            while (running) {
                System.out.println("\n1. View\n2. Add\n3. Remove\n4. Exit");
                System.out.print("Choose an option: ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "1": viewTask(); break;
                    case "2": addTask(); break;
                    case "3": removeTask(); break;
                    case "4":
                        System.out.println("bye bye");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option, try again.");
                }
            }
        }

        saveTask();
        sc.close();
    }

    // Load tasks from file
    private static void loadTask() throws IOException {
        File file = new File(File_Name);
        if (file.exists()) {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                tasks.add(fileReader.nextLine());
            }
            fileReader.close();
        }
    }

    // Save tasks to file
    private static void saveTask() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(File_Name));
        for (String task : tasks) {
            writer.write(task);
            writer.newLine();
        }
        writer.close();
    }

    // View tasks
    private static void viewTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Add task
    private static void addTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new task: ");
        String newTask = sc.nextLine();
        tasks.add(newTask);
        System.out.println("Task added successfully!");
    }

    // Remove task
    private static void removeTask() {
        Scanner sc = new Scanner(System.in);
        viewTask();
        if (tasks.isEmpty()) return;

        System.out.print("Enter task number to remove: ");
        int index = sc.nextInt();
        sc.nextLine(); // consume newline

        if (index > 0 && index <= tasks.size()) {
            System.out.println("Removed: " + tasks.remove(index - 1));
        } else {
            System.out.println("Invalid task number.");
        }
    }
}