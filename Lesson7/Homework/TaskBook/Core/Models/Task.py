import datetime

"""Class for creating a task"""


class Task:
    id_c = 0

    def __init__(self, task_text, deadline, author, priority):
        self.id = Task.id_c
        self.datetime = datetime.datetime.now()
        self.deadline = deadline
        self.author = author
        self.task_text = task_text
        self.priority = priority
        Task.id_c += 1



    def set_id(self, ids):
        self.id = ids

    def get_id(self):
        return self.id

    def get_deadline(self):
        return self.deadline

    def set_deadline(self, deadline):
        self.deadline = deadline

    def get_author(self):
        return self.author

    def set_author(self, author):
        self.author = author

    def get_task_text(self):
        return self.task_text

    def set_task_text(self, task_text):
        self.task_text = task_text

    def get_priority(self):
        return str(self.priority)

    def set_priority(self, priority):
        self.priority = priority

    def get_datetime(self):
        return str(datetime)

    def __str__(self):
        return str(self.id) + ";" + str(self.datetime) + ";" + self.deadline + \
            ";" + self.author + ";" + self.task_text + ";" + self.priority + "\n"

    def __repr__(self):
        return str(self.id) + ";" + str(self.datetime) + ";" + self.deadline + \
            ";" + self.author + ";" + self.task_text + ";" + self.priority + "\n"
