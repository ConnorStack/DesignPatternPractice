package me.designpatterns.Introduction;

abstract public class Dog {
    BarkBehavior barkBehavior;
    PlayBehavior playBehavior;

    public void performBark(){
        barkBehavior.bark();
    }

    public void performPlay(){
        playBehavior.play();
    }
}
