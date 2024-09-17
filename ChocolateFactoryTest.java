public class ChocolateFactoryTest {
    public static void main(String[] args) {
        // Get the Singleton instance of ChocolateFactory
        ChocolateFactory factory1 = ChocolateFactory.getInstance();

        // Fill, boil, and drain the chocolate mixture
        factory1.fill();
        factory1.boil();
        factory1.drain();
        factory1.displayStatus();

        System.out.println("-----");

        // Get the Singleton instance from another place in the program
        ChocolateFactory factory2 = ChocolateFactory.getInstance();

        // Try filling, boiling, and draining again with the same instance
        factory2.fill();
        factory2.boil();
        factory2.drain();
        factory2.displayStatus();

        // Verify that both factory1 and factory2 are the same instance
        System.out.println("Are both instances the same? " + (factory1 == factory2));
    }
}
