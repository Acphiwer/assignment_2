package za.ac.cput.assignment_2;

public class List
{
    private String name;

    public List(String name) {
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
