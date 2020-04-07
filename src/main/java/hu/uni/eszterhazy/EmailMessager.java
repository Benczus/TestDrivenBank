package hu.uni.eszterhazy;

public class EmailMessager extends Messager {

    String emailAddress;

    public EmailMessager(Subject subject, String emailAddress) {
        super(subject);
        this.emailAddress=emailAddress;
    }

    @Override
    String displayMessage() {
        //MOCK METHOD FOR SENDING EMAIL
        System.out.println(this.state +" sent to "+ this.emailAddress);
        return this.state +" sent to "+ this.emailAddress;
    }
}
