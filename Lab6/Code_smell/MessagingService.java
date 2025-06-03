package Code_smell;

import java.util.*;

class MessagingService {
    private final Map<String, List<Message>> inbox = new HashMap<>();
    

    public void sendMessage(String content, String sender, String recipient) {
        Message message = new Message(content, sender, recipient);
        inbox.computeIfAbsent(recipient, k -> new ArrayList<>()).add(message);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        return inbox.getOrDefault(recipient, Collections.emptyList());
    }

    public Map<String, List<Message>> getInbox() {
        return inbox;
    }

    
}