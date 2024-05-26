package animals;

public abstract class Caretaker {
    private static String firstName;
    private static String lastName;
    private static int id;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }

    abstract void takeCare();

    public void displayInfo(){
        System.out.println("Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("ID: " + getId());
    }
}
