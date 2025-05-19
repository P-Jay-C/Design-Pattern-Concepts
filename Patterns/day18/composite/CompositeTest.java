package day18.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory docs = new Directory("docs");

        File file1 = new File("file1.txt");
        File file2 = new File("file2.pdf");

        root.addComponent(home);
        home.addComponent(docs);
        home.addComponent(file1);
        docs.addComponent(file2);

        root.display();
    }
}
