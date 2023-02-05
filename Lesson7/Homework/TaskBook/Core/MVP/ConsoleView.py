class ConsoleView:

    def show_message(self, message):
        print(message)

    def get_task_text(self):
        return input("Задача: ")

    def set_task_text(self, value):
        print("Задача: {}\n".format(value))

    def get_priority(self):
        print("Выберите приоритет:\n" +
              "1 - Немедленно\n" +
              "2 - Средний\n" +
              "3 - Низкий\n")
        print("Выбор: ", end="")
        choice = int(input().strip())
        if choice == 1:
            return "IMMEDIATE"
        elif choice == 2:
            return "MEDIUM"
        else:
            return "LOW"

    def set_priority(self, value):
        print("Приоритет: {}".format(value))

    def get_deadline(self):
        return input("Дедлайн: ")

    def set_deadline(self, value):
        print("Дедлайн: {}\n".format(value))

    def get_author(self):
        return input("Автор: ")

    def set_author(self, value):
        print("Автор: {}\n".format(value))

    def set_create_date(self, value):
        print("Дата и время создания задачи: {}\n".format(value))

    def print_menu(self):
        print("""
1 - Добавить задачу
2 - Показать все задачи
3 - Сохранить БД
4 - Экспортировать в CSV
0 - Завершить работу
            """)
        print("Ваш выбор: ", end="")
