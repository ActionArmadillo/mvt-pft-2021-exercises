package week_05.exercise_016_05;

public class Circle extends Shape {
    private double radius = 0.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String computeArea(){
        double area = Math.PI * Math.pow((radius),2);
        return "The area of this Circle is  " + area;
    }
}
