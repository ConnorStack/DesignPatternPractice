package practice.designpatterns;

import practice.designpatterns.CommandPattern.Light;
import practice.designpatterns.CommandPattern.LightsOnCommand;
import practice.designpatterns.Introduction.BulmaDog;
import practice.designpatterns.Introduction.Dog;
import practice.designpatterns.Introduction.PlayBehavior;
import practice.designpatterns.Introduction.PlayNotAtAll;
import practice.designpatterns.Introduction.SquidDog;
import practice.designpatterns.Introduction.WilburDog;
import practice.designpatterns.StatePattern.GumballMachine;
import practice.designpatterns.StrategyPattern.Characters;
import practice.designpatterns.StrategyPattern.Queen;

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

        
        // Dog squidDog = new SquidDog();
        // squidDog.performBark();
        // squidDog.performPlay();

        // Dog bulmaDog = new BulmaDog();
        // bulmaDog.performBark();
        // bulmaDog.performPlay();

        // Dog wilburDog = new WilburDog();
        // wilburDog.performBark();
        // wilburDog.performPlay();
        // wilburDog.setPlayBehavior(new PlayNotAtAll());
        // wilburDog.performPlay();
        Characters queenCharacter = new Queen();
        queenCharacter.utilizeWeaponBehavior();
    }

    public void statePatternDemo(){
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        for (int i = 0; i < 15; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine);
        }
    
    }
}
