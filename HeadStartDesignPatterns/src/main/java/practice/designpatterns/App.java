package practice.designpatterns;

import practice.designpatterns.CommandPattern.Light;
import practice.designpatterns.CommandPattern.LightsOnCommand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println("Yo");
        Light light = new Light();
        LightsOnCommand lightsOnCommand = new LightsOnCommand(light);
        light.isOn();

        lightsOnCommand.execute();
        light.isOn();

    }
}
