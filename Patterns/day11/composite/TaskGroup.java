package day11.composite;

import java.util.ArrayList;
import java.util.List;

public class TaskGroup implements TaskComponent {
    private String name;
    private List<TaskComponent> components = new ArrayList<>();

    public TaskGroup(String name) {
        this.name = name;
    }
    public void add(TaskComponent component) {
        components.add(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getTimeHours() {
        return components.stream().mapToInt(TaskComponent::getTimeHours).sum();
    }

    @Override
    public void display() {
        System.out.println("Group: " + name + ", Total Time: " + getTimeHours() + " hours");
        for (TaskComponent component: components){
            component.display();
        }
    }
}
