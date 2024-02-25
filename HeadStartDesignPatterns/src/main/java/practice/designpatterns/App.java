package practice.designpatterns;

import practice.designpatterns.CommandPattern.Light;
import practice.designpatterns.CommandPattern.LightsOnCommand;
import practice.designpatterns.DecoratorPattern.Beverage;
import practice.designpatterns.DecoratorPattern.DarkRoast;
import practice.designpatterns.DecoratorPattern.Espresso;
import practice.designpatterns.DecoratorPattern.HouseBlend;
import practice.designpatterns.DecoratorPattern.Mocha;
import practice.designpatterns.DecoratorPattern.Soy;
import practice.designpatterns.DecoratorPattern.WhipCream;
import practice.designpatterns.Introduction.BulmaDog;
import practice.designpatterns.Introduction.Dog;
import practice.designpatterns.Introduction.PlayBehavior;
import practice.designpatterns.Introduction.PlayNotAtAll;
import practice.designpatterns.Introduction.SquidDog;
import practice.designpatterns.Introduction.WilburDog;
import practice.designpatterns.ObserverPattern.CurrentConditionsDisplay;
import practice.designpatterns.ObserverPattern.WeatherData;
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
        decoratorPatternDemo();

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
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // So each subsequent object of CurrentConditionsDisplay would be an example of
        // another observer,
        // And there could be a practically infinite number of observers, but we only
        // want one subject of a similar kind
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

    public static void decoratorPatternDemo() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new WhipCream(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new WhipCream(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }
}
