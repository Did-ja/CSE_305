package Code_smell;

import java.util.List;
import java.util.Map;

public class MessagePrinter {
    public void printSumaryMessage(Message message) {
        System.out.println(message.toString());
    }

    public void printDetailMessage(Message message) {
        System.out.println("Message Details:");
        System.out.println("Content: " + message.getContent());
        System.out.println("Sender: " + message.getSender().toUpperCase());
        System.out.println("Recipient: " + message.getRecipient().toLowerCase());
        System.out.println("Timestamp: " + message.getTimestamp());
    }

    public void printAllMessages(Map<String, List<Message>> inbox) {
        for (String recipient : inbox.keySet()) {
            List<Message> messages = inbox.get(recipient);
            for (Message message : messages) {
                printSumaryMessage(message);

            }
        }
    }
    public void printAllMessagesForRecipient(List<Message> messages) {
        for (Message message : messages) {
            printSumaryMessage(message);
        }
    }
}
