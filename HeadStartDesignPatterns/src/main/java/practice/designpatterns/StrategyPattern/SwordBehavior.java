package practice.designpatterns.StrategyPattern;

public class SwordBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("Slashy slashy");
    }
}
