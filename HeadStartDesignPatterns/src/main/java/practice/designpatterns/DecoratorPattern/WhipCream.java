package practice.designpatterns.DecoratorPattern;

public class WhipCream extends CondimentDecorator {
    Beverage beverage;

    public WhipCream(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Whipcream";
    }

    public double cost() {
        return this.beverage.cost() + .15;
    }

}
