from Homework.TaskBook.Core.Models.FileMod.Database import Database
from Homework.TaskBook.Core.Models.FileMod.ExportCSV import ExportCSV


class Model:

    def __init__(self):
        self.current_book = []

    def set_current_book(self, book):
        self.current_book = book

    def save(self):
        database = Database(self.current_book)
        database.save()

    def load(self):
        database = Database(self.current_book)
        self.current_book = database.load()

    def export_to_csv(self):
        export_csv = ExportCSV(self.current_book)
        export_csv.export_to()

    def get_current_book(self):
        return self.current_book
