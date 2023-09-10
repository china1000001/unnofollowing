public class Programmer extends Person{
    private String companyName;
    public Programmer(String name, String lastName, int age,String companyName) {
        super(name, lastName, age);
        this.companyName = companyName;
    }
public Programmer(){

}
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+companyName;
    }
}
