package animals;

public class Volunteer extends Caretaker {


    @Override
    public void takeCare() {
        System.out.println("Volunteer " + getFirstName() + " " + getLastName() + " is trating animals");
    }
}
