package day13.chainOfResponsibility;


public abstract class AbstractHandler implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(SupportRequest request) {
        if (next != null) {
            next.handle(request);
        }
    }

}
