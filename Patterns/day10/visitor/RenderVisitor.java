package day10.visitor;

public class RenderVisitor implements Visitor {
    @Override
    public void visit(TestElement testElement) {
        System.out.println("Rendering text: " + testElement.getContent());
    }

    @Override
    public void visit(ImageElement imageElement) {
        System.out.println("Rendering image: " + imageElement.getImagePath());
    }
}
