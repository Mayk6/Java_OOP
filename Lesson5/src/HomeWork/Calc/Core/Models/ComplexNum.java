package HomeWork.Calc.Core.Models;

import HomeWork.Calc.Core.MVP.Model;

import java.util.Scanner;
/*
Class for working with complex numbers
 */
public class ComplexNum implements Model {
    double real;
    double image;

    public ComplexNum(double real, double image){
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }

    @Override
    public ComplexNum sum(Object obj) {
        double newReal = this.real + ((ComplexNum)obj).getReal();
        double newImage = this.image + ((ComplexNum)obj).getImage();
        return new ComplexNum(newReal, newImage);
    }

    @Override
    public ComplexNum div(Object obj) {
        double newReal = this.real / ((ComplexNum)obj).getReal();
        double newImage = this.image / ((ComplexNum)obj).getImage();
        return new ComplexNum(newReal, newImage);
    }

    @Override
    public ComplexNum sub(Object obj) {
        double newReal = this.real - ((ComplexNum)obj).getReal();
        double newImage = this.image - ((ComplexNum)obj).getImage();
        return new ComplexNum(newReal, newImage);
    }

    @Override
    public ComplexNum mul(Object obj) {
        double newReal = this.real * ((ComplexNum)obj).getReal();
        double newImage = this.image * ((ComplexNum)obj).getImage();
        return new ComplexNum(newReal, newImage);
    }

    @Override
    public String toString() {
        return "(" + real + ") + (" + image + "i)";
    }
}
