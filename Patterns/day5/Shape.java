package day5;

public interface Shape extends Cloneable{
    Shape clone();
    void setAttribute(String attribute);
    void draw();
}
