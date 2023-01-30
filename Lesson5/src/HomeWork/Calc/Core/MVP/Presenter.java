package HomeWork.Calc.Core.MVP;

import HomeWork.Calc.Core.Models.ComplexNum;
import HomeWork.Calc.Core.Models.RationalNum;
/*
The class with the logic for running the calculator
 */
public class Presenter<T extends Model> {


    View view;
    Model num1;
    Model num2;

    public Presenter(View v){
        this.view = v;
    }

    public void ButtonClick(){
        while (true){
            switch (view.choiceTypeNumb()){
                case 1 -> {
                    num1 = new RationalNum(view.getValue("Введите первое число: "));
                    num2 = new RationalNum(view.getValue("Введите второе число: "));
                }
                case 2 -> {
                    System.out.println("Введите первое число");
                    num1 = new ComplexNum(view.getValue("Реальная часть:"), view.getValue("Мнимая часть:"));
                    System.out.println("Введите второе число");
                    num2 = new ComplexNum(view.getValue("Реальная часть:"), view.getValue("Мнимая часть:"));
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Такой команды нет");
            }
            switch (view.showOperation()){
                case 1 -> view.showResult(num1.sum(num2).toString());
                case 2 -> view.showResult(num1.sub(num2).toString());
                case 3 -> view.showResult(num1.mul(num2).toString());
                case 4 -> view.showResult(num1.div(num2).toString());
            }
        }

    }
}
