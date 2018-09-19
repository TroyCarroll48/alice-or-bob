package week3;

import java.util.Scanner;

public class calculator {






    public calculator() {


    }

    public double plus(double num1, double num2){
        return num1 + num2;
    }

    public double subtract(double num1, double num2){
       return num1 - num2;
    }
    public double multiply(double num1, double num2){
        return num1 * num2;
    }
    public double divide(double num1, double num2){
        return num1 / num2;
    }
    public double square(double num1){
        return num1 * num1;
    }

    public double sqroot(double num1){
        return Math.sqrt(num1);
    }

    public double power(double num1, double num2){
        return Math.pow(num1,num2);
    }
    public double sin(double num1){
        return Math.sin((Math.toRadians(num1)));
    }
    public double cos(double num1){
        return Math.cos((Math.toRadians(num1)));
    }


}
