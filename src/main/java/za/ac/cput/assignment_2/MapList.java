package za.ac.cput.assignment_2;

import java.util.HashMap;
import java.util.Map;

public class MapList {
    private String name;

    public MapList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "List{" +
                "Skunk Clients ='" + name + '\'' +
                '}';


    }
}
