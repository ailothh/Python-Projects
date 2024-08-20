package src;


//Abstract class Animal
abstract class Animal {
    // Properties
    String name;
    String species;

    // Constructor
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Getters, no setters for name and species
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    // Abstract method
    public abstract void makeSound();
}

//Subclass Lion
class Lion extends Animal {
    public Lion(String name) {
        super(name, "Lion");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Roar!");
    }
}

//Subclass Elephant
class Elephant extends Animal {
    public Elephant(String name) {
        super(name, "Elephant");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Achoo!");
    }
}

//Subclass Giraffe
class Giraffe extends Animal {
    public Giraffe(String name) {
        super(name, "Giraffe");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Hummm!");
    }
}



