from Homework.TaskBook.Core.Models.Task import Task
from Homework.TaskBook.Core.MVP.Model import Model


class Presenter:

    def __init__(self, view):
        self.model = Model()
        self.view = view

    def add(self):
        print("Enter task:")
        self.model.current_book.append(
            Task(self.view.get_task_text(), self.view.get_deadline(), self.view.get_author(), self.view.get_priority()))

    def save_to_db(self):
        self.model.save()
        print("Successfully saved")

    def load_from_db(self):
        self.model.load()

    def show_all_tasks(self):
        for tsk in self.model.current_book:
            print("----------")
            print("Task #:", tsk.get_id())
            self.view.set_task_text(tsk.get_task_text())
            self.view.set_deadline(tsk.get_deadline())
            self.view.set_author(tsk.get_author())
            self.view.set_priority(tsk.get_priority)
            self.view.set_create_date(tsk.get_datetime())

    def export_csv(self):
        self.model.export_to_csv()
        self.view.show_message("Export complete")
