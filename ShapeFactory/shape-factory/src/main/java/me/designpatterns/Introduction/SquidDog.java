package me.designpatterns.Introduction;

public class SquidDog extends Dog {

    public SquidDog(){
        barkBehavior = new GrumbleBark();
        playBehavior = new PlayMean();
    }
    
}
