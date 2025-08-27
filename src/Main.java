public class Main {
    public static void main(String[] args) {
        // Criando notificações usando a fábrica
        Notification email = NotificationFactory.createNotification("email");
        email.notifyUser("Bem-vindo ao sistema!");

        Notification sms = NotificationFactory.createNotification("sms");
        sms.notifyUser("Seu código é 1234");

        Notification push = NotificationFactory.createNotification("push");
        push.notifyUser("Você tem uma nova mensagem.");
    }
}


