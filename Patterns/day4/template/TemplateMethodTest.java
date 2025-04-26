package day4.template;

public class TemplateMethodTest {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVProcessor();
        csvProcessor.processData("name,age\nJohn,30");

        DataProcessor jsonProcessor = new JSONProcessor();
        jsonProcessor.processData("{\"name\":\"Jane\",\"age\":25}");
    }
}