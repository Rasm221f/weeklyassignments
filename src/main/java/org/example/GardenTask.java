package org.example;

import java.time.LocalDate;

public class GardenTask extends Task {
    private String gardenLocation;

    public GardenTask(String title, String description, LocalDate dueDate) {
        super(title, description, dueDate);
    }
}
