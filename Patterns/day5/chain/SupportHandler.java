package day5.chain;

public abstract class SupportHandler implements Handler{
    protected Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(int severity) {
    if (next != null){
        next.handleRequest(severity);
    }
    }
}
