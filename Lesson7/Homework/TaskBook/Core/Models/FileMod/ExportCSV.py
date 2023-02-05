from Homework.TaskBook.Core.Models.FileMod.WorkWithFiles import WorkWithFiles


class ExportCSV(WorkWithFiles):

    def __init__(self, taskbook):
        super().__init__("exportData.csv", taskbook)

    def export_to(self):
        try:
            with open(self.get_path(), "w") as writer:
                headers = "id;CreateDate;DeadLine;Author;TaskText;Priority\n"
                writer.write(headers)
                for tsk in self.get_taskbook():
                    writer.write(str(tsk))
        except IOError as ex:
            print(ex)
