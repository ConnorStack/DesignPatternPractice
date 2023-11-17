package practice.designpatterns.StrategyPattern;

public abstract class Characters {
    WeaponBehavior weaponBehavior;

    public void utilizeWeaponBehavior(){
        weaponBehavior.useWeapon();
    }
}
