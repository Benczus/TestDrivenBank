package hu.uni.eszterhazy;

public class RESTMessager extends Messager {

    String requestID;

    public RESTMessager(Subject subject, String requestID) {
        super(subject);
        this.requestID=requestID;
    }

    @Override
    String displayMessage() {
        //MOCK METHOD FOR SENDING REST MESSAGE
        System.out.println(this.state +" sent to "+ this.requestID);
        return this.state +" sent to "+ this.requestID;
    }
}
