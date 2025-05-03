package day10.visitor;

public interface Visitor {
    void visit(TestElement testElement);

    void visit(ImageElement imageElement);
}

