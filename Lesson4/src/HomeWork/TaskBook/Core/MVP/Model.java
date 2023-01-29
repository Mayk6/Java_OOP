package HomeWork.TaskBook.Core.MVP;

import HomeWork.TaskBook.Core.Enums.Priorities;
import HomeWork.TaskBook.Core.Infrostructure.Taskbook;
import HomeWork.TaskBook.Core.Models.Task;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Model {

    Taskbook currentBook;

    public Model() {
        currentBook = new Taskbook();
    }

    public void setCurrentBook(Taskbook book) {
        this.currentBook = book;
    }

    public void save() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tasks.dat"))) {
            oos.writeObject(currentBook);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void load() {
        Taskbook tasks;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tasks.dat"))) {
            tasks = (Taskbook) ois.readObject();
            int maxID = 0;
            for (Task task : tasks.getTasks()) {
                if (task.getId() > maxID) maxID = task.getId();
            }
            Task.setID(++maxID);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            tasks = new Taskbook();
        }
        this.currentBook = tasks;
    }

    public void importFromCSV() {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Path.of("exportData.csv"));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        for (int i = 1; i < lines.size(); i++) {
            List<String> row = List.of(lines.get(i).split(";"));
            Task tskTemp = new Task();
            tskTemp.setDeadline(row.get(2));
            tskTemp.setAuthor(row.get(3));
            tskTemp.setTaskText(row.get(4));
            switch (row.get(5)) {
                case "IMMEDIATE" -> tskTemp.setPriority(Priorities.IMMEDIATE);
                case "MEDIUM" -> tskTemp.setPriority(Priorities.MEDIUM);
                case "LOW" -> tskTemp.setPriority(Priorities.LOW);
            }
            currentBook.add(tskTemp);
        }
    }

    public void exportToCSV() {
        try (FileWriter writer = new FileWriter("exportData.csv", false)) {
            String headers = "id;CreateDate;DeadLine;Author;TaskText;Priority\n";
            writer.write(headers);
            for (Task tsk : currentBook.getTasks()) {
                writer.write(tsk.toString());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Taskbook getCurrentBook() {
        return this.currentBook;
    }

}
