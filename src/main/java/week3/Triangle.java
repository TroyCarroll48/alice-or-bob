package week3;

public class Triangle {

    double base;
    double height = 3;

    public Triangle(double base){
        this.base = base;
    }

    public double AoT(){
        return base * height / 2;
    }
}