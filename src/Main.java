
import FlyBehavior.FlyRocketPowered;
import Model.DecoyDuck;
import Model.Duck;
import Model.MallardDuck;
import Model.RubberDuck;



public class Main {

    public static void main(String[] args) {
        
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck rubber = new RubberDuck();
        rubber.performQuack();
        rubber.performFly();
        
        Duck decoy = new DecoyDuck();
        decoy.performQuack();
        decoy.performFly();
        decoy.setFlyBehavior(new FlyRocketPowered());
        decoy.performFly();
    }
}
