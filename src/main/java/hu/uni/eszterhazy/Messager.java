package hu.uni.eszterhazy;

public abstract class Messager implements Observer{

    Subject subject;
    String state;
    Messager(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        this.state=subject.getState();
        displayMessage();
    }

    abstract String displayMessage();
}
