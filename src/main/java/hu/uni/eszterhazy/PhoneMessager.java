package hu.uni.eszterhazy;

public class PhoneMessager extends Messager {

    private String phoneNumber;
    public PhoneMessager(Subject subject, String phoneNumber) {
        super(subject);
        this.phoneNumber=phoneNumber;
    }

    @Override
    String displayMessage() {
        //MOCK METHOD FOR SENDING PHONE MESSAGE
        System.out.println(this.state +" sent to "+ this.phoneNumber);
        return this.state +" sent to "+ this.phoneNumber;
    }
}
