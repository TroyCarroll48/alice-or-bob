package week3;

public class Circle {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateareac(){
        return Math.PI * radius * radius;
    }

}
