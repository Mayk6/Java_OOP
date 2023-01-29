package HomeWork.TaskBook.Core.MVP;

import HomeWork.TaskBook.Core.Models.Task;

public class Presenter {

    private Model model;
    private View view;

    public Presenter(View view) {
        this.view = view;
        this.model = new Model();
    }

    public void add() {
        System.out.println("Введите задачу: ");
        model.currentBook.add(
                new Task(view.getTaskText(), view.getDeadline(), view.getAuthor(), view.getPriority()));
    }

    public void saveToDb() {
        model.save();
        System.out.println("Успешно сохранено");
    }

    public void loadFromDb() {
        model.load();
    }

    public void showAllTasks() {
        for (Task tsk : model.currentBook.getTasks()) {
            System.out.println("Здача №:" + tsk.getId());
            view.setTaskText(tsk.getTaskText());
            view.setDeadline(tsk.getDeadline());
            view.setAuthor(tsk.getAuthor());
            view.setPriority(tsk.getPriority().toString());
            view.setCreateDate(tsk.getDateTime().toString());
            System.out.println();
        }
    }

    public void importCSV() {
        model.importFromCSV();
    }

    public void exportCSV() {
        model.exportToCSV();
    }


}
