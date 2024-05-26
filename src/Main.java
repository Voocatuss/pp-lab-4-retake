import animals.Animal;
import animals.Shelter;
import animals.Veterinarian;
import animals.Volunteer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shelter shelter = new Shelter();

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();

        animal2.setName("Andrzej");
        animal2.setAge(10);

        shelter.addAnimal(animal1);
        shelter.addAnimal(animal2);
        shelter.addAnimal(animal3);
        shelter.addAnimal(animal4);

        Veterinarian veterinarian1 = new Veterinarian();
        Veterinarian veterinarian2 = new Veterinarian();
        veterinarian2.takeCare();

        Volunteer volunteer1 = new Volunteer();
        Volunteer volunteer2 = new Volunteer();
        Volunteer volunteer3 = new Volunteer();
        Volunteer volunteer4 = new Volunteer();

        volunteer3.takeCare();
        volunteer4.takeCare();

        shelter.addCaretaker(veterinarian1);
        shelter.addCaretaker(veterinarian2);
        shelter.addCaretaker(volunteer1);
        shelter.addCaretaker(volunteer2);
        shelter.addCaretaker(volunteer3);
        shelter.addCaretaker(volunteer4);


        shelter.displayAnimals();
        shelter.displayCaretakers();

        shelter.removeAnimals(animal2);
        shelter.removeCaretaker(veterinarian1);
        shelter.removeCaretaker(volunteer1);

        System.out.println();

        shelter.displayAnimals();
        shelter.displayCaretakers();


        for(int i=0; i<20; i++){
            shelter.addAnimal(new Animal());
        }


        for(int i=22; i>=0; i--){
            shelter.removeAnimals(i);
        }

        for(int i=3; i>=0; i--){
            shelter.removeCaretaker(i);
        }

        System.out.println(shelter.getAdoptedAnimals()+" has been adopted");
        System.out.println(shelter.getDeadAnimals()+" has died because of ilness or age");
        System.out.println(shelter.getFiredCaretakers()+" has decided to leave");

        shelter.displayAnimals();
        shelter.displayCaretakers();
    }
}