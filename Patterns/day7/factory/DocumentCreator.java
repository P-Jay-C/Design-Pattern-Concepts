package day7.factory;

public abstract class DocumentCreator {
    public abstract Document createDocument();

    public void processDocument(){
        Document document = createDocument();
        document.generate();
    }

}
