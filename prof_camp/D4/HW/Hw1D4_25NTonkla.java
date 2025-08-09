package HW;

//25
public class Hw1D4_25NTonkla {

    public static void main(String[] args) {
        NotificationSender n1 = new EmailNotification("user@example.com", "welcome", "Thanks for joining.");
        NotificationSender n2 = new SmsNotification("+66900000000", "Your OTP is 123456");
        NotificationSender n3 = new PushNotification("DEVICE-ABC", "You have a new message");

        n1.send();
        n2.send();
        n3.send();

    }
}

interface NotificationSender {
    public void send();
}

abstract class Notification implements NotificationSender
{
    protected String title;
    protected String message;

    public Notification(String title , String message)
    {
        this.title = title;
        this.message = message;
    }

    public void preview()
    {
        System.out.println(String.format("[Preview] title : %s with msg : %s" , title , message));
    }
  
    abstract public void send();
 
}

class EmailNotification extends Notification
{
    private String email;
    private String subject;

    public EmailNotification(String email , String subject , String message)
    {
        super(subject, message);
        this.email = email;
        this.subject = subject;
        this.message = message;

    }


    @Override
    public void send() {
       
        System.out.println(String.format("[Email] to %s | %s : %s ", email , subject , message));
    }
}

class SmsNotification extends Notification {

    public String phoneNumber;

    public SmsNotification(String phoneNumber , String message)
    {
        super(phoneNumber, message);
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println(String.format("[SMS] to %s : %s", phoneNumber , message));
    }

    
}

class PushNotification extends Notification
{
    public String deviceId;

    public PushNotification(String deviceId , String message)
    {
        super(deviceId, message);
        this.deviceId = deviceId;
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println(String.format("[Push] to device %s : %s", deviceId , message));
    }

}
// Why P P declare method and not using it ???????????????
// Why. i don't understand
// Whyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy

