package study10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "kim"));
        messageQueue.offer(new Message("sendSMS", "Park"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendSMS":
                    System.out.println(message.to + " SMS");
                    break;
                case "sendMail":
                    System.out.println(message.to + " Mail");
                    break;
            }
        }
    }
}
