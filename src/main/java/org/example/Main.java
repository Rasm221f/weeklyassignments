package org.example;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TaskList<Task> taskList = new TaskList<>();

        //taskList.addTask(new Task("Finish Report", "Complete the financial report by end of day", LocalDate.of(2024, 8, 25)));
        //taskList.addTask(new Task("Team Meeting", "Discuss project progress with the team", LocalDate.of(2024, 8, 26)));
        //taskList.addTask(new Task("Write Documentation", "Update the API documentation", LocalDate.of(2024, 9, 1)));
        //taskList.addTask(new Task("Prepare Presentation", "Create slides for the marketing presentation", LocalDate.of(2024, 8, 29)));

        //taskList.addTask(new Task("Finish Report", "Complete the financial report by end of day", LocalDate.now()));  // Due today
        //taskList.addTask(new Task("Team Meeting", "Discuss project progress with the team", LocalDate.of(2024, 8, 26)));  // Future date
        //taskList.addTask(new Task("Write Documentation", "Update the API documentation", LocalDate.now()));  // Due today
        taskList.addTask(new Task("Finish Report", "Complete the financial report", LocalDate.of(2024, 8, 25)));  // Overdue
        taskList.addTask(new Task("Team Meeting", "Discuss project progress", LocalDate.of(2024, 8, 24)));  // Overdue
        taskList.addTask(new Task("Prepare Presentation", "Create slides for presentation", LocalDate.now().plusDays(1)));  // Not overdue
        taskList.addTask(new Task("Write Documentation", "Update the API docs", LocalDate.now().minusDays(1)));  // Overdue

        // Get overdue tasks
        List<Task> overdueTasks = taskList.getTasksOverdue();
        System.out.println("Overdue tasks:");
        overdueTasks.forEach(System.out::println);

        // Get tasks due today
        //List<Task> dueTodayTasks = taskList.getTasksDueToday();
        //System.out.println("Tasks due today:");
        //dueTodayTasks.forEach(System.out::println);

        //taskList.sortByDueDate();
        //System.out.println("Tasks sorted by due date:");
        //taskList.getTasks().forEach(System.out::println);

        // Filter tasks based on the keyword "report"
        //List<Task> filteredTasks = taskList.filterByKeyword("report");
        // filteredTasks.forEach(System.out::println);
    }
}