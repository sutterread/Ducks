package Model;

import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;



public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    

    @Override
    public void display() {
    }
    
    
}
