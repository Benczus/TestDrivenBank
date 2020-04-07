package hu.uni.eszterhazy;

public class EmailMesseger extends Messeger {

    String emailAddress;

    public EmailMesseger(Subject subject, String emailAddress) {
        super(subject);
        this.emailAddress=emailAddress;
    }

    @Override
    String displayMessege() {
        //MOCK METHOD FOR SENDING EMAIL
        return this.state +" sent to "+ this.emailAddress;
    }
}
