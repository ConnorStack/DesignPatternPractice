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
import practice.designpatterns.StrategyPattern.King;
import practice.designpatterns.StrategyPattern.Knight;
import practice.designpatterns.StrategyPattern.Queen;
import practice.designpatterns.StrategyPattern.Troll;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        statePatternDemo();

    }

    public static void statePatternDemo() {
        GumballMachine gumballMachine = new GumballMachine(100);
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

    public static void strategyPatternDemo() {
        Characters queen = new Queen();
        Characters king = new King();
        Characters troll = new Troll();
        Characters knight = new Knight();

        queen.utilizeWeaponBehavior();
        king.utilizeWeaponBehavior();
        troll.utilizeWeaponBehavior();
        knight.utilizeWeaponBehavior();
    }

    public void strategyPatternWithDoggos() {
        Dog squidDog = new SquidDog();
        squidDog.performBark();
        squidDog.performPlay();

        Dog bulmaDog = new BulmaDog();
        bulmaDog.performBark();
        bulmaDog.performPlay();

        Dog wilburDog = new WilburDog();
        wilburDog.performBark();
        wilburDog.performPlay();
        wilburDog.setPlayBehavior(new PlayNotAtAll());
        wilburDog.performPlay();
    }

    public static void commandPatternDemo() {
        Light light = new Light();
        LightsOnCommand lightsOnCommand = new LightsOnCommand(light);
        light.isOn();

        lightsOnCommand.execute();
        light.isOn();
    }

    public static void observerPatternDemo() {

    }
}
