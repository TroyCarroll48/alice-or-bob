package week3;

import java.util.Scanner;

public class tuesday {

    public static void main(String[] args) {

        Scanner Java = new Scanner(System.in);

        calculator mom = new calculator();

//           public calculator(double num1, double num2) {
//            this.num1 = num1;
//            this.num2 = num2;
//
//        }



//        Square red = new Square(4);
//
//        System.out.println(red.sides);
//        System.out.println(red.are());
//
//
//        Circle blue = new Circle(99);
//
//        System.out.println(blue.radius);
//        System.out.println(blue.calculateareac());
//
//        Triangle black = new Triangle(3);
//
//        System.out.println(black.AoT());

//        calculator ti81 = new calculator(45,9);//adjacent,Hypotenuse,Opposite,Square

//        System.out.println(ti81):

        System.out.println("What is your first number");

        int num1 = Java.nextInt();

        System.out.println("what is your second number");

        int num2 = Java.nextInt();







        System.out.println("====================");

        System.out.println("num1 + num2 is:" + mom.plus(num1,num2));

        System.out.println("====================");

        System.out.println("num1 - num2 is: " + mom.subtract(num1,num2));

        System.out.println("====================");

        System.out.println("num1 multiply by num2 is: " + mom.multiply(num1,num2));

        System.out.println("====================");

        System.out.println("num1 divided by num2 is: " + mom.divide(num1,num2));

        System.out.println("====================");

        System.out.println("the square of num1 is: " + mom.square(num1));

        System.out.println("====================");

        System.out.println("the square root os num1 is: " + mom.sqroot(num1));

        System.out.println("====================");

        System.out.println("num1 raised to the power of num2 is: " + mom.power(num1,num2));

        System.out.println("====================");

        System.out.println("Sine of num1 is: " + mom.sin(num1));

        System.out.println("====================");

        System.out.println("Cosine of num1 is: " + mom.cos(num1));











    }
}
