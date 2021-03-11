package week_05.exercise_016_05;

public class Triangle extends Shape{
    private double base = 0.0;
    private double height = 0.0;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return this.base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public String computeArea(){
        double area = (base * height) / 2;
        return "The area of this Triangle is " + area;
    }
}
