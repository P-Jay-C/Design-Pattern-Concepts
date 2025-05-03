package day10.prototype;

public interface Report extends Cloneable{
    Report clone();
    void setTittle(String title);
    void setData(String data);
    void display();
}
