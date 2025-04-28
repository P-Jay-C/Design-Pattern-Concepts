package day5.prototype;

public interface Shape extends Cloneable{
    Shape clone();
    void setAttribute(String attribute);
    void draw();
}
