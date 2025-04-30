package day7.factory;

import javax.print.Doc;

public class FactoryMethodTest {
    public static void main(String args[]) {
        // Create a factory for creating books
       DocumentCreator pdfCreator = new PDFDocumentCreator();
       DocumentCreator wordCreator = new WordDocumentCreator();

       pdfCreator.processDocument();
       wordCreator.processDocument();

    }
}
