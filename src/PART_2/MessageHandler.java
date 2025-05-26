package PART_2;

import java.util.Scanner;
/**
 *
 * @author Name: Jarriath
 * Surname: Marais
 * Student Number: ST10457058
 */

//PART 2
public class MessageHandler {

    public static void sendMessages() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many messages do you want to send? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Message " + (i + 1) + " ---");
            Message.sendMessage(scanner);
        }

        System.out.println("\nAll messages processed.");
        System.out.println("Total messages sent: " + Message.getTotalMessages());
    }
}
