package day15.prototype;

public interface Product extends Cloneable{
    Product clone();
    void setName(String name);
    void setPrice(double price);
    void display();
}
