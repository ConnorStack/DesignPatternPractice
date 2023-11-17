package practice.designpatterns.Introduction;

abstract public class Dog {
    BarkBehavior barkBehavior;
    PlayBehavior playBehavior;

    public void performBark(){
        barkBehavior.bark();
    }

    public void performPlay(){
        playBehavior.play();
    }

    public void setBarkBehavior(BarkBehavior barkBehavior){
        this.barkBehavior = barkBehavior;
    }

    public void setPlayBehavior(PlayBehavior playBehavior){
        this.playBehavior = playBehavior;
    }
}
