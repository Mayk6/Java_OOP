package HomeWork.Calc.Client;

import HomeWork.Calc.Core.MVP.Presenter;
import HomeWork.Calc.UI.ConsoleView;

public class Program {

    public static void main(String[] args) {
        Presenter p = new Presenter<>(new ConsoleView());
        p.ButtonClick();
    }
}
