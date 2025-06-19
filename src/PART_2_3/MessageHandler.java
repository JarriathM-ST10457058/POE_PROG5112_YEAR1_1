package PART_2_3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Name: Jarriath
 * Surname: Marais
 * Student Number: ST10457058
 */

//PART 2
public class MessageHandler {

    // PART 3 
    //arrays
    private static List<Message> sentMessages = new ArrayList<>();
    private static List<Message> disregardedMessages = new ArrayList<>();
    private static List<Message> storedMessages = new ArrayList<>();
    private static List<String> messageHashes = new ArrayList<>();
    private static List<String> messageIDs = new ArrayList<>();

    public static void sendMessages() { // Send messages
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many messages do you want to send? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Message " + (i + 1) + " ---");
            Message.sendMessage(scanner, sentMessages, disregardedMessages, storedMessages, messageHashes, messageIDs);
        }

        System.out.println("\nAll messages processed.");
        System.out.println("Total messages sent: " + Message.getTotalMessages());
    }

    //PART 3 
    //Report menu method
    public static void showReportMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nReport Menu:");
            System.out.println("1. Display all sent messages");
            System.out.println("2. Show longest sent message");
            System.out.println("3. Search by Message ID");
            System.out.println("4. Search messages to recipient");
            System.out.println("5. Delete message by hash");
            System.out.println("6. Full message report");
            System.out.println("7. Back");
            System.out.print("Enter option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> displayAllSent();
                case 2 -> showLongestMessage();
                case 3 -> {
                    System.out.print("Enter Message ID: ");
                    String id = scanner.next();
                    searchByID(id);
                }
                case 4 -> {
                    System.out.print("Enter Recipient Number: ");
                    String recipient = scanner.next();
                    searchByRecipient(recipient);
                }
                case 5 -> {
                    System.out.print("Enter Message Hash: ");
                    String hash = scanner.next();
                    deleteByHash(hash);
                }
                case 6 -> fullReport();
            }
        } while (choice != 7);
    }

    private static void displayAllSent() {
        for (Message m : sentMessages) {
            m.displayMessage();
        }
    }

    private static void showLongestMessage() {
        Message longest = null;
        for (Message m : sentMessages) {
            if (longest == null || m.getMessageContent().length() > longest.getMessageContent().length()) {
                longest = m;
            }
        }
        if (longest != null) longest.displayMessage();
    }

    private static void searchByID(String id) {
        for (Message m : sentMessages) {
            if (m.getMessageID().equals(id)) {
                m.displayMessage();
                return;
            }
        }
        System.out.println("Message ID not found.");
    }

    private static void searchByRecipient(String recipient) {
        for (Message m : sentMessages) {
            if (m.getRecipientCell().equals(recipient)) {
                m.displayMessage();
            }
        }
    }

    private static void deleteByHash(String hash) {
        sentMessages.removeIf(m -> m.getMessageHash().equals(hash));
        System.out.println("Message deleted (if it existed).");
    }

    private static void fullReport() {
        System.out.println("=== FULL SENT MESSAGE REPORT ===");
        for (Message m : sentMessages) {
            m.displayMessage();
        }
    }
}
