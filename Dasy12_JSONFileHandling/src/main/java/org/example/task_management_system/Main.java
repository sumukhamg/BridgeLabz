package org.example.task_management_system;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Task task1 = new Task(111, "complete project 1", "1-10-2025");
        Task task2 = new Task(112, "complete course", "12-11-2025");
        Task task3 = new Task(113, "complete project 2", "1-10-2024");

        TaskManagement toDoTasks = new TaskManagement();

        System.out.println("Make a choice: ");
        System.out.println("1. Add task");
        System.out.println("2. view tasks");
        System.out.println("3. updateTask details");
        System.out.println("4. Delete Task");
        System.out.println("5. Mark as completed");

        int choice = scan.nextInt();
        if(choice > 5 || choice < 1){
            System.out.println("Invalid choice");
        }

        while(true){
            switch(choice){
                case 1:
                    System.out.println("Enter id");
                    int id = scan.nextInt();
                    System.out.println("description");
                    String description = scan.nextLine();
                    System.out.println("due Date");
                    String dueDate = scan.nextLine();
                    toDoTasks.addTask(new Task(id, description, dueDate));
                    break;

                case 2:
                    System.out.println();
            }
        }


    }


}
