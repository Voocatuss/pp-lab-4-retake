package animals;

public class Veterinarian extends Caretaker {


    @Override
    public void takeCare() {
        System.out.println("Doctor  " + getFirstName() + " " + getLastName() + "is feeding animals");
    }

}
