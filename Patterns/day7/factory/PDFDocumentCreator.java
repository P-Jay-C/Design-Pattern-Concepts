package day7.factory;

public class PDFDocumentCreator extends DocumentCreator{
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
