package day10.visitor;

public interface DocumentElement {
    void accept(Visitor visitor);
}
