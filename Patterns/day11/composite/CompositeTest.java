package day11.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Task task1 = new Task("Design UI", 10);
        Task task2 = new Task("Write Tests", 8);
        Task task3 = new Task("Implement API", 15);

        TaskGroup frontend = new TaskGroup("Frontend Development");
        frontend.add(task1);
        frontend.add(task2);

        TaskGroup backend = new TaskGroup("Backend Development");
        backend.add(task3);

        TaskGroup project = new TaskGroup("Project");
        project.add(frontend);
        project.add(backend);

        project.display();
        System.out.println("Total Project Time: " + project.getTimeHours() + " hours");
    }
}
