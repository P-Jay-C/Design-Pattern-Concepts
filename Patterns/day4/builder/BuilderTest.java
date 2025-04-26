package day4.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.ComputerBuilder("Intel i5", 8)
                .setStorage(256)
                .build();
        System.out.println("Basic Computer: " + basicComputer);

        Computer gamingComputer = new Computer.ComputerBuilder("AMD Ryzen 9", 32)
                .setStorage(1000)
                .setGPU("NVIDIA RTX 3080")
                .build();
        System.out.println("Gaming Computer: " + gamingComputer);
    }
}