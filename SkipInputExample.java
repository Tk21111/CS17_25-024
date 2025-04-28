import java.util.Scanner;

public class SkipInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something (you have 5 seconds): ");

        InputThread inputThread = new InputThread(scanner);
        inputThread.start();

        try {
            inputThread.join(5000); // wait 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (inputThread.isAlive()) {
            System.out.println("No input. Using default value.");
            inputThread.interrupt(); // stop waiting
        }
    }
}

class InputThread extends Thread {
    private Scanner scanner;

    public InputThread(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        try {
            String input = scanner.nextLine();
            System.out.println("You entered: " + input);
        } catch (Exception e) {
            // If interrupted
        }
    }
}
 
