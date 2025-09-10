package org.example.task_management_system;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManagement {
    public List<Task> taskList = new ArrayList<>();
    private static final String FILE_PATH = "task_lists.json";


    public void addTask(Task task){
        if(task == null )
            throw new IllegalArgumentException("Value cannot be null");
            for (Task tasks : taskList) {
                if (tasks.getTaskId() == task.getTaskId())
                    throw new IllegalArgumentException("Tasks id already exist");
            }
            taskList.add(task);
            addTaskToJSON(this, FILE_PATH);

    }

    public void addTaskToJSON(TaskManagement toDoTask, String filePath){
        ObjectMapper mapper = new ObjectMapper();
        try{
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), toDoTask.taskList);
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }

    public void viewAllTask(){
        if(taskList != null)
            System.out.println(toString());
        else
            System.out.println("No task lists");
    }

    public void updateTask(int id){
        Scanner scan = new Scanner(System.in);
        boolean found = false;
        for (Task tasks : taskList){
            if(tasks.getTaskId() == id){
                found = true;
                System.out.println("Write the description");
                String desc = scan.nextLine();

                System.out.println("Change Due Date");
                String dueDate = scan.nextLine();

                tasks.setDescription(desc);
                tasks.setDueDate(dueDate);
                break;
            }
        }
        if(found)
            addTaskToJSON(this, FILE_PATH);
        else
            throw new IllegalArgumentException("Cannot find task with id " + id);
    }

    public void deleteTask(int id){
        boolean found = false;
        for (Task tasks : taskList){
            if(tasks.getTaskId() == id){
                found = true;
                taskList.remove(tasks);
                break;
            }
        }
        if(found)
            addTaskToJSON(this, FILE_PATH);
        else
            throw new IllegalArgumentException("Cannot find task with id " + id);
    }

    public void markCompleted(int id){
        boolean found = false;
        for (Task tasks : taskList){
            if(tasks.getTaskId() == id){
                found = true;
                tasks.setStatus(true);
                break;
            }
        }
        if(found)
            addTaskToJSON(this, FILE_PATH);
        else
            throw new IllegalArgumentException("Cannot find task with id " + id);

    }

    public String toString(){
        String tasks = "";
        for(Task task : taskList){
            tasks += task.getTaskId() + " " + task.getDescription() + " " + task.getDueDate() + "\n" ;
        }

        return tasks;
    }
}
