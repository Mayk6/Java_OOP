class Taskbook:

    def __init__(self):
        self.tasks = []

    def contains(self, index):
        return len(self.tasks) > index

    def add_task(self, task):
        self.tasks.append(task)

    def get_task(self, index):
        return self.tasks.index(index) if self.contains(index) else None

    def remove(self, task):
        flag = False
        if task in self.tasks:
            self.tasks.remove(task)
            flag = True
        return flag

    def add(self, task):
        self.tasks.append(task)

    def get_tasks(self):
        return self.tasks
