package day13.chainOfResponsibility;

public interface Handler {
    void setNext(Handler next);
    void handle(SupportRequest request);
}