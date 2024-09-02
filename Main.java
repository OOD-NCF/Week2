public class Main {
    public static void main(String[] args) {
        // Reuse the formatMessage method to format different messages
        String welcomeMessage = MessageFormatter.formatMessage("Welcome to the Program");
        String exitMessage = MessageFormatter.formatMessage("Thank you for using the Program");

        // Print the formatted messages
        System.out.println(welcomeMessage);
        System.out.println(exitMessage);
    }
}
