package HomeWork.Calc.Core.Models;

import HomeWork.Calc.Core.MVP.Model;

/*
Class for working with rational numbers
 */
public class RationalNum implements Model {

    private double value;

    public RationalNum(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public Double sum(Object obj) {
        return this.value + ((RationalNum)obj).getValue();
    }

    @Override
    public Double div(Object obj) {
        return this.value + ((RationalNum)obj).getValue();
    }

    @Override
    public Double sub(Object obj) {
        return this.value + ((RationalNum)obj).getValue();
    }

    @Override
    public Double mul(Object obj) {
        return this.value + ((RationalNum)obj).getValue();
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
