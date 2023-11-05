package me.designpatterns.Shapes;

public class Circle extends Shape{
    private double pi = Math.PI;
    private int radius;
    
    public Circle(int radius){
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return Math.sqrt(this.pi*this.radius);
    }
    
}
