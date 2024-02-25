package practice.designpatterns.DecoratorPattern;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }

    public double cost() {
        return 2.89;
    }
}
