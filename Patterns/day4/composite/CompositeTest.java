package day4.composite;

public class CompositeTest {
    public static void main(String[] args) {
       File file1 = new File("dcoument.txt");
       File file2 = new File("image.png");

       Directory dir1 = new Directory("Documents");
       Directory dir2 = new Directory("Images");

       dir1.add(file1);
       dir2.add(file2);
       dir2.add(dir1);

       dir2.showDetails();

    }
}
