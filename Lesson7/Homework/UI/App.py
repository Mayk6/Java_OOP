import sys
from Homework.TaskBook.Core.MVP.ConsoleView import ConsoleView
from Homework.TaskBook.Core.MVP.Presenter import Presenter


class App:

    def __init__(self):
        self.view = ConsoleView()
        self.presenter = Presenter(self.view)

    def button_click(self):
        with sys.stdin as in_:
            self.presenter.load_from_db()
            while True:
                self.view.print_menu()
                choice = in_.readline().strip()
                if choice == "1":
                    self.presenter.add()
                elif choice == "2":
                    self.presenter.show_all_tasks()
                elif choice == "3":
                    self.presenter.save_to_db()
                elif choice == "4":
                    self.presenter.export_csv()
                elif choice == "0":
                    print("Завершение работы")
                    sys.exit(0)
                else:
                    print("Такой команды нет")
