package day5.chain;

public interface Handler {
    void setNext(Handler next);
    void handleRequest(int severity);
}