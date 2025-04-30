package day7.factory;

public class PDFDocument extends  Document{
    @Override
    public void generate() {
        System.out.println("Generating PDF document...");
    }
}
