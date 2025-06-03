package Code_smell;

import java.time.LocalDateTime;

/**
 * This class represents a message with content, sender, recipient, and
 * timestamp.
 * It is designed to be immutable and provides methods to access its properties. 
 * So we don't need summary method and detail method.
 */
class Message {
    private final String content;
    private final String sender;
    private final String recipient;
    private final LocalDateTime timestamp;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
        this.timestamp = LocalDateTime.now();
    }
    
    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Mesagge includes: \n" +
                "Content: " + content + "\n" +
                "Sender: " + sender + "\n" +
                "Recipient: " + recipient + "\n" +
                "Timestamp: " + timestamp;
    }
}
