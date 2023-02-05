from Homework.TaskBook.Core.Models.FileMod.WorkWithFiles import WorkWithFiles
import pickle
from Homework.TaskBook.Core.Infrostructure.Taskbook import Taskbook
from Homework.TaskBook.Core.Models.Task import Task


class Database(WorkWithFiles):

    def __init__(self, taskbook):
        super().__init__("Database.dat", taskbook)

    def save(self):
        try:
            with open(self.get_path(), 'wb') as file:
                pickle.dump(self.get_taskbook(), file)
        except Exception as ex:
            print(ex)

    def load(self):
        tasks = None
        try:
            with open(self.get_path(), 'rb') as file:
                tasks = pickle.load(file)
                max_id = 0
                for task in tasks:
                    if task.get_id() > max_id:
                        max_id = task.get_id()
                Task.id_c += 1
        except Exception as ex:
            print(ex)
            tasks = Taskbook()
        return tasks
