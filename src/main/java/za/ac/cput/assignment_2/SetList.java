package za.ac.cput.assignment_2;

public class SetList
{
    private String name;

    public SetList(String name) {
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
