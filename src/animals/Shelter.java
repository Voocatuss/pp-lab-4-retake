package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shelter {
    private static List<Animal> animals = new ArrayList<Animal>();
    private static List<Caretaker> caretakers = new ArrayList<Caretaker>();
    public int adoptedAnimals= 0;
    public int deadAnimals = 0;
    public int firedCaretakers = 0;




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
            adoptedAnimals++;
        }
        else{
            System.out.println(animal.getSpecies()+" "+ animal.getName()+" died in shelter from illness or age…");
            deadAnimals++;
        }
    }
    public void removeAnimals(int i){

        Random random = new Random();
        int los = random.nextInt(100);
        if(los <= 25){
            System.out.println(animals.get(i).getSpecies()+" "+ animals.get(i).getName()+" has been adopted. Hooray!");
            adoptedAnimals++;
        }
        else{
            System.out.println(animals.get(i).getSpecies()+" "+ animals.get(i).getName()+" died in shelter from illness or age…");
            deadAnimals++;
        }
        animals.remove(i);
    }



    public void removeCaretaker(Caretaker caretaker){
        caretakers.remove(caretaker);
        firedCaretakers++;
    }
    public void removeCaretaker(int i){
        caretakers.remove(i);
        firedCaretakers++;
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
    public int getAdoptedAnimals(){
        return adoptedAnimals;
    }
    public int getDeadAnimals(){
        return deadAnimals;
    }
    public int getFiredCaretakers(){
        return firedCaretakers;
    }


}
