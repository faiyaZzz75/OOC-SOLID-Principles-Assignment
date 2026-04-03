package dip;

// DIP Fix: abstraction that both high and low level modules depend on
public interface MessageSender {
    void send(String message);
}
