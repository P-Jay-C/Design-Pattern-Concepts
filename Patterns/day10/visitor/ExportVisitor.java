package day10.visitor;

public class ExportVisitor implements Visitor {
    @Override
    public void visit(TestElement testElement) {
        System.out.println("Exporting text to markdown: " + testElement.getContent());
    }

    @Override
    public void visit(ImageElement imageElement) {
        System.out.println("Exporting image to base64: " + imageElement.getImagePath());
    }
}
