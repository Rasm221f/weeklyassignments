package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList<T extends Task> {
    private List<T> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(T task) {
        tasks.add(task);
    }

    public List<T> getTasks() {
        return tasks;
    }

    public List<T> filterByKeyword(String keyword) {

        return tasks.stream()
                .filter(item -> item.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                        item.getDescription().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void sortByDueDate() {
        tasks.sort((item, item2) -> item.getDueDate().compareTo(item2.getDueDate()));
    }

    public List<T> getTasksDueToday(){
        return tasks.stream().filter(item -> item.getDueDate().equals(LocalDate.now()))
                .collect(Collectors.toList());
    }
    public List<T> getTasksOverdue(){
        return tasks.stream().filter(item -> item.getDueDate().isBefore(LocalDate.now()))
                .collect(Collectors.toList());
    }

}