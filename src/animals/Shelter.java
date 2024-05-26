package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shelter {
    private static List<Animal> animals = new ArrayList<Animal>();
    private static List<Caretaker> caretakers = new ArrayList<Caretaker>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
    public void addCaretaker(Caretaker caretaker) {
        caretakers.add(caretaker);
    }
    public void removeAnimals(Animal animal){
        animals.remove(animal);
        Random random = new Random();
        int los = random.nextInt(100);
        if(los <= 25){
            System.out.println(animal.getSpecies()+" "+ animal.getName()+" has been adopted. Hooray!");
        }
        else{
            System.out.println(animal.getSpecies()+" "+ animal.getName()+" died in shelter from illness or age…");
        }
    }

    public void removeCaretaker(Caretaker caretaker){
        caretakers.remove(caretaker);
    }

    public void displayAnimals(){
        for(int i = 0; i<animals.size(); i++){
            animals.get(i).displayInfo();
        }
        System.out.println();
    }
    public void displayCaretakers(){
        for(int i = 0; i<caretakers.size(); i++){
            caretakers.get(i).displayInfo();
        }
        System.out.println();
    }
}
