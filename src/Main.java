import animals.Animal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();

       animal1.displayInfo();
       animal2.displayInfo();
       animal3.displayInfo();
       animal4.displayInfo();
        System.out.println();

        System.out.println(animal2.getName()+" "+animal2.getAge()+" "+animal2.getSpecies());
        System.out.println();

        animal2.setName("Andrzej");
        animal2.setAge(10);

        animal2.displayInfo();



    }
}