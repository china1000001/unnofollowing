public class Singer extends Person{
    private String bandName;
    public Singer(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    public String getBandName() {
        return bandName;
    }

    public Singer() {
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+ bandName;
    }
}
