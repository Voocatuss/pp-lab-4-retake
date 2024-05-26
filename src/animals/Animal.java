package animals;

public class Animal {
    private String name;
    private int age;
    private static String species;

    public String getName() {
        return name;
    }
    public  int getAge() {
        return age;
    }
    public String getSpecies() {
        return species;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species);
    }
}
