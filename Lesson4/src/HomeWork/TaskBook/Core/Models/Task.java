package HomeWork.TaskBook.Core.Models;

import HomeWork.TaskBook.Core.Enums.Priorities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task implements Serializable {
    private static Integer ID = 0;
    private final Integer id;
    private final LocalDateTime dateTime;
    private String deadline;
    private String author;
    private String taskText;
    private Priorities priority;

    public Task() {
        this.id = ID++;
        this.dateTime = LocalDateTime.now();
    }


    public Task(String taskText, String deadLine, String author, Priorities priority) {
        this.id = ID++;
        this.dateTime = LocalDateTime.now();
        this.deadline = deadLine;
        this.author = author;
        this.taskText = taskText;
        this.priority = priority;
    }

    public Integer getId() {
        return id;
    }

    public static void setID(Integer ID) {
        Task.ID = ID;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadLine) {
        this.deadline = deadLine;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }

    public Priorities getPriority() {
        return priority;
    }

    public void setPriority(Priorities priority) {
        this.priority = priority;
    }

    public String getDateTime() {
        return dateTime.format(DateTimeFormatter.ofPattern("d-MM-yy HH:mm"));
    }

    @Override
    public String toString() {
        return this.id + ";" + this.dateTime.format(DateTimeFormatter.ofPattern("d-MM-yy:HH-mm")) + ";" + this.deadline + ";"
                + this.author + ";" + this.taskText + ";" + this.priority + "\n";
    }
}
