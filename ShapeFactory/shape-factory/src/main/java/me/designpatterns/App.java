package me.designpatterns;

import java.text.DecimalFormat;

import me.designpatterns.Shapes.Circle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Circle circle = new Circle(5);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double circleArea = circle.calculateArea();
        String firmattedArea = decimalFormat.format(circleArea);
        System.out.println("Area is: " + firmattedArea);
    }
}
