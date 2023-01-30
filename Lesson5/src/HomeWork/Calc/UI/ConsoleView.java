package HomeWork.Calc.UI;

import HomeWork.Calc.Core.MVP.View;

import java.util.Scanner;
/*
Class for displaying information on the screen
 */
public class ConsoleView implements View {

    Scanner in = new Scanner(System.in);

    @Override
    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    @Override
    public int showOperation() {
        String menu = "Выебрите действие\n" +
                "1 - Сложение\n" +
                "2 - Вычетание\n" +
                "3 - Умножение\n" +
                "4 - Деление\n";
        System.out.println(menu);
        System.out.print("Ваш выбор: ");
        return in.nextInt();
    }

    @Override
    public int choiceTypeNumb() {
        String menu = "Добро пожаловать!\n" +
                "С какими числами будем работать?\n" +
                "1 - Рационалные\n" +
                "2 - Комплексными\n" +
                "3 - Завершить работу\n";
        System.out.println(menu);
        System.out.print("Ваш выбор: ");
        return in.nextInt();
    }

    @Override
    public void showResult(String data) {
        System.out.printf("Результат:  %s\n", data);
    }

}
