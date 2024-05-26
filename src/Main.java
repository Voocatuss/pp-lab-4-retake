import animals.Animal;
import animals.Veterinarian;
import animals.Volunteer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();

        Veterinarian veterinarian1 = new Veterinarian();

        veterinarian1.displayInfo();
        veterinarian1.takeCare();

        Volunteer volunteer1 = new Volunteer();
        Volunteer volunteer2 = new Volunteer();

        volunteer1.displayInfo();
        volunteer1.takeCare();

        volunteer2.displayInfo();
        volunteer2.takeCare();

       animal1.displayInfo();
       animal2.displayInfo();
       animal3.displayInfo();
       animal4.displayInfo();
        System.out.println();

        animal2.displayInfo();
        System.out.println();

        animal2.setName("Andrzej");
        animal2.setAge(10);

        animal2.displayInfo();



    }
}