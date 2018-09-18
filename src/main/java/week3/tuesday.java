package week3;

import java.util.Scanner;

public class tuesday {

    public static void main(String[] args) {

        Scanner Java = new Scanner(System.in);

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

        calculator ti81 = new calculator(45,9);//adjacent,Hypotenuse,Opposite,Square

//        System.out.println(ti81);

        System.out.println("====================");

        System.out.println("num1 + num2 is:" + ti81.plus());

        System.out.println("====================");

        System.out.println("num1 - num2 is: " + ti81.subtract());

        System.out.println("====================");

        System.out.println("num1 multiply by num2 is: " + ti81.multiply());

        System.out.println("====================");

        System.out.println("num1 divided by num2 is: " + ti81.divide());

        System.out.println("====================");

        System.out.println("the square of num1 is: " + ti81.square());

        System.out.println("====================");

        System.out.println("the square root os num1 is: " + ti81.sqroot());

        System.out.println("====================");

        System.out.println("num1 raised to the power of num2 is: " + ti81.power());

        System.out.println("====================");

        System.out.println("Sine of num1 is: " + ti81.sin());

        System.out.println("====================");

        System.out.println("Cosine of num1 is: " + ti81.cos());



//        System.out.println(ti81.sin());
//
//        System.out.println("====================");
//
//        System.out.println(ti81.cos());
//
//        System.out.println("====================");
//
//        System.out.println(ti81.tan());
//
//        System.out.println("====================");







    }
}
