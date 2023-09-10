public class Main {
    public static void main(String[] args) {
//            Programmer programmer = new Programmer("china","esenbaev",15,"IT ");
//programmer.setCompanyName("IT");
//        System.out.println(programmer);
      //  Person person = new Person();
        Programmer programmer = new Programmer();
        programmer.setName("chyngyz");
        programmer.setLastName("esenbaev");
        programmer.setAge(15);
        programmer.setCompanyName("IT.KG");
        System.out.println(programmer);
        System.out.println("--------------------------");
        Singer singer = new Singer();
        singer.setName("china bratan");
        singer.setLastName("esenbaev");
        singer.setAge(16);
        singer.setBandName("king and shut");
        System.out.println(singer);
        System.out.println("--------------------------");
        Dancer dancer = new Dancer();
        dancer.setName("chinachingihan");
        dancer.setLastName("esenbaev");
        dancer.setAge(11);
        dancer.setGroupName("mstiteli");
        System.out.println(dancer);
    }
}