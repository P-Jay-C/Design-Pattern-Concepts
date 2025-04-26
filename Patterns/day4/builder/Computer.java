package day4.builder;

public class Computer {
    private final String CPU;
    private final  int RAM;
    private final int storage;
    private final String GPU;

    public Computer(ComputerBuilder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;

    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", GPU='" + GPU + '\'' +
                '}';
    }

    public static class ComputerBuilder {
        private final String CPU;
        private final int RAM;
        private int storage;
        private String GPU;

        public ComputerBuilder(String CPU, int RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }
        public ComputerBuilder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}
