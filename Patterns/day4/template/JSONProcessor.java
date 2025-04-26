package day4.template;

public class JSONProcessor extends DataProcessor{
    private String data;

    @Override
    protected void readData(String data) {
        this.data = data;
        System.out.println("Reading JSON data: " + data);
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON data: " + data);
    }

}
