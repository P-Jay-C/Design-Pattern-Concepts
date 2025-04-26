package day4.template;

public class CSVProcessor extends DataProcessor{
    private String data;

    @Override
    protected void readData(String data) {
        this.data = data;
        System.out.println("Reading CSV data: " + data);
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data: " + data);
    }
}
