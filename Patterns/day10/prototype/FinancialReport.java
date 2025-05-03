package day10.prototype;

public class FinancialReport implements Report {

    private String title;
    private String data;

    public  FinancialReport(){
        this.title = "Financial Report";
        this.data = "Financial Data";
    }
    @Override
    public Report clone() {
        try {
            return (Report) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported",e);
        }
    }

    @Override
    public void setTittle(String title) {
        this.title = title;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void display() {
        System.out.println("Report: " + title + ", Data: " + data);
    }
}
