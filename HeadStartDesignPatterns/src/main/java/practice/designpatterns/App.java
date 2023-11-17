package practice.designpatterns;

import practice.designpatterns.CommandPattern.Light;
import practice.designpatterns.CommandPattern.LightsOnCommand;
import practice.designpatterns.Introduction.BulmaDog;
import practice.designpatterns.Introduction.Dog;
import practice.designpatterns.Introduction.SquidDog;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println("Yo");
        // Light light = new Light();
        // LightsOnCommand lightsOnCommand = new LightsOnCommand(light);
        // light.isOn();

        // lightsOnCommand.execute();
        // light.isOn();

        
        Dog squidDog = new SquidDog();
        squidDog.performBark();
        squidDog.performPlay();

        Dog bulmaDog = new BulmaDog();
        bulmaDog.performBark();
        bulmaDog.performPlay();
    }
}
