package hu.uni.eszterhazy;

public abstract class Messeger implements Observer{

    Subject subject;
    String state;
    public Messeger(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        this.state=subject.getState();
    }

    abstract String displayMessege();
}
