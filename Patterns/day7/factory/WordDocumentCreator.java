package day7.factory;

public class WordDocumentCreator extends DocumentCreator{
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
