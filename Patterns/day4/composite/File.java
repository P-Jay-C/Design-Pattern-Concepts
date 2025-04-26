package day4.composite;

import java.util.ArrayList;
import java.util.List;

public class File implements Component {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
    
}

