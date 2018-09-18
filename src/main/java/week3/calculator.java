package week3;

public class calculator {

    double num1;
    double num2;


    public calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;

    }

    public double plus(){
        return num1 + num2;
    }
    public double subtract(){
       return num1 - num2;
    }
    public double multiply(){
        return num1 * num2;
    }
    public double divide(){
        return num1 / num2;
    }
    public double square(){
        return num1 * num1;
    }

    public double sqroot(){
        return Math.sqrt(num1);
    }

    public double power(){
        return Math.pow(num1,num2);
    }
    public double sin(){
        return Math.sin((Math.toRadians(num1)));
    }
    public double cos(){
        return Math.cos((Math.toRadians(num1)));
    }


}
