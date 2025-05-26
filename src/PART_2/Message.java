package PART_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Name: Jarriath
 * Surname: Marais
 * Student Number: ST10457058
 */

//PART 2
public class Message {
    private static List<Message> messageList = new ArrayList<>();
    private static int totalMessages = 0;

    private String messageID;
    private String recipientCell;
    private String messageContent;
    private String messageHash;

    public Message(String recipientCell, String messageContent) {
        this.messageID = generateMessageID();
        this.recipientCell = recipientCell;
        this.messageContent = messageContent;
        this.messageHash = createMessageHash();
    }

    // Generate a 10-digit random message ID
    private String generateMessageID() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(rand.nextInt(10));
        }
        return sb.toString();
    }

    // Validate that the message ID is 10 digits
    public boolean checkMessageID() {
        return messageID.length() == 10;
    }

    // Check if recipient cell is valid
    public boolean checkRecipientCell() {
        return recipientCell.length() <= 10 && (recipientCell.startsWith("27") || recipientCell.startsWith("+"));
    }

    // Create a simple hash using message ID and content
    public String createMessageHash() {
        String shortContent = messageContent.length() < 2
                ? messageContent
                : messageContent.substring(0, 1) + messageContent.charAt(messageContent.length() - 1);
        return messageID.substring(0, 2) + ":" + (totalMessages + 1) + shortContent.toUpperCase();
    }

    // Method to input and send a message
    public static void sendMessage(Scanner scanner) {
        System.out.print("Enter recipient cell number: ");
        String cell = scanner.next();

        scanner.nextLine(); // clear input buffer
        System.out.print("Enter your message (max 250 chars): ");
        String msg = scanner.nextLine();

        if (msg.length() > 250) {
            System.out.println("Message too long. Max 250 characters.");
            return;
        }

        Message m = new Message(cell, msg);

        if (!m.checkMessageID() || !m.checkRecipientCell()) {
            System.out.println("Invalid message or recipient format.");
            return;
        }

        System.out.println("1. Send Message\n2. Disregard Message\n3. Store Message to send later");
        int option = scanner.nextInt();

        if (option == 1) {
            messageList.add(m);
            totalMessages++;
            System.out.println("Message sent!");
            m.displayMessage();
        } else if (option == 3) {
            m.storeMessage();  // Save to messages.txt
            System.out.println("Message stored.");
        } else {
            System.out.println("Message discarded.");
        }
    }

    // Store message in a plain text file
    public void storeMessage() {
        try (FileWriter writer = new FileWriter("messages.txt", true)) {
            writer.write("MessageID: " + messageID + "\n");
            writer.write("Hash: " + messageHash + "\n");
            writer.write("Recipient: " + recipientCell + "\n");
            writer.write("Message: " + messageContent + "\n");
            writer.write("---\n"); // Separator for readability
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Print details of the message
    public void displayMessage() {
        System.out.println("\n=== Message Info ===");
        System.out.println("Message ID: " + messageID);
        System.out.println("Hash: " + messageHash);
        System.out.println("Recipient: " + recipientCell);
        System.out.println("Message: " + messageContent);
    }

    public static int getTotalMessages() {
        return totalMessages;
    }

    public static void printAllMessages() {
        for (Message m : messageList) {
            m.displayMessage();
        }
        System.out.println("Total messages sent: " + totalMessages);
    }
}