package day10.visitor;

public class VisitorTest {
    public static void main(String[] args) {
        Document document = new Document();

        document.addElement(new TestElement("Hello, World!"));
        document.addElement(new ImageElement("logo.png"));
        document.addElement(new ImageElement("Footer text"));

        Visitor renderVisitor = new RenderVisitor();
        Visitor exportVisitor = new ExportVisitor();

        System.out.println("Rendering document:");
        document.accept(renderVisitor);

        System.out.println("\nExporting document:");
        document.accept(exportVisitor);
    }
}
