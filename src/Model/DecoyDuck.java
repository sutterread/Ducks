
package Model;

import FlyBehavior.FlyNoWay;
import QuackBehavior.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
    }
}