package day11.composite;

public class Task implements TaskComponent {
    private String name;
    private  int timeHours;

    public Task(String name, int timeHours) {
        this.name = name;
        this.timeHours = timeHours;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTimeHours() {
        return timeHours;
    }

    @Override
    public void display() {
        System.out.println("Task: " + name + ", Time: " + timeHours + " hours");
    }
}
