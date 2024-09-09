/*Workable: Interface that only includes the work() method.
Eatable: Interface that only includes the eat() method.
HumanWorker: Implements both Workable and Eatable since humans need to work and eat.
RobotWorker: Implements only Workable, as robots only work and don’t need to eat.
*/
public class Main {
    public static void main(String[] args) {
        // Create a HumanWorker object that works and eats
        HumanWorker humanWorker = new HumanWorker();
        System.out.println("Human Worker:");
        humanWorker.work();
        humanWorker.eat();

        // Create a RobotWorker object that only works
        RobotWorker robotWorker = new RobotWorker();
        System.out.println("\nRobot Worker:");
        robotWorker.work();
    }
}
