package me.designpatterns;

import java.text.DecimalFormat;

import me.designpatterns.Shapes.Circle;
import me.designpatterns.Shapes.Rectangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10.5, 2.5);
        
        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();

        System.out.println("Circle area: " + circleArea);
        System.out.println("Rectangle area: " + rectangleArea);

        // DecimalFormat decimalFormat = new DecimalFormat("#.##");
        // String firmattedArea = decimalFormat.format(circleArea);
        // System.out.println("Area is: " + firmattedArea);



    }
}
