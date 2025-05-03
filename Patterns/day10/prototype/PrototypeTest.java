package day10.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        ReportRegistory reportRegistory = new ReportRegistory();

        reportRegistory.registerPrototypes("financial", new FinancialReport());
        reportRegistory.registerPrototypes("sales", new SalesReport());

        Report financial1 = reportRegistory.getPrototype("financial");
        financial1.setTittle("Q1 Financials");
        financial1.setData("Revenue: $1M");
        financial1.display();

        Report financial2 = reportRegistory.getPrototype("financial");
        financial2.setTittle("Q2 Financials");
        financial2.setData("Revenue: $1.2M");
        financial2.display();

        Report sale = reportRegistory.getPrototype("sales");
        sale.setTittle("Annual Sales");
        sale.setData("Units Sold: 500");
        sale.display();
    }
}
