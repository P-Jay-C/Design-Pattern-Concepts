package day4.template;

public abstract class DataProcessor {

    protected abstract void readData(String data);
    protected abstract void parseData();

    protected void saveData() {
        System.out.println("Saving data to database");
    }

    public final void processData(String data) {
        readData(data);
        parseData();
        saveData();
    }

}
