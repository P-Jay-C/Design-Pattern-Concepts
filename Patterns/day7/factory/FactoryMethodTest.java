package day7.factory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        // Create a factory for creating books
       DocumentCreator pdfCreator = new PDFDocumentCreator();
       DocumentCreator wordCreator = new WordDocumentCreator();

       pdfCreator.processDocument();
       wordCreator.processDocument();

    }
}
