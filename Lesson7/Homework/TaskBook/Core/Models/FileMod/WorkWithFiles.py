class WorkWithFiles:
    def __init__(self, path, taskbook):
        self.path = path
        self.taskbook = taskbook

    def get_taskbook(self):
        return self.taskbook

    def get_path(self):
        return self.path
