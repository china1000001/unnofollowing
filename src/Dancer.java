public class Dancer extends Person{
    private String groupName;
    public Dancer(String name, String lastName, int age) {
        super(name, lastName, age);

    }

    public Dancer() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+ groupName;
    }
}

