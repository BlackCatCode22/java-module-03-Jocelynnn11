package myanimals;

public class Dog extends Animal{

        // the Dog class is a subclass of Animal
        // it should have all the methods from the Animal class
        // available to it.
        // THis is polymorphism - this word means "many shapes"
        // when used here, by a Cat Object, this method has the same name
        // as the method in the superclass, take another shape.

        public void animalSound (){
            System.out.println("\n A sound from the Dog class used by a Dog Object- bark");
        }
    }


