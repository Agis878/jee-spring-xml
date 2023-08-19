package pl.coderslab.beans;

public class EmailService implements MessageService {
    private String message;


    @Override
    public void send() {
        System.out.println("Sending Email");
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
