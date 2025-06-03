package Code_smell;
import java.util.*;
public class Test {
    public static void main(String[] args) {
         MessagingService messagingService = new MessagingService(); 
         MessagePrinter messagePrinter = new MessagePrinter();
        // sending messages 
        messagingService.sendMessage("Hello, tenant!", "Property Manager", "Tenant A"); 
        messagingService.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A"); 
        messagingService.sendMessage("Maintenance request received.", "Tenant A", "Property Manager"); 
 
        // retrieving messages for a recipient 
        List<Message> tenantAMessages = messagingService.getMessagesForRecipient("Tenant A"); 
        messagePrinter.printAllMessagesForRecipient(tenantAMessages);
 
        // Calling the new method 
        Message exampleMessage = new Message("Test", "Sender", "Recipient"); 
        messagePrinter.printSumaryMessage(exampleMessage);
 
        messagePrinter.printAllMessages(messagingService.getInbox());
    }
}
