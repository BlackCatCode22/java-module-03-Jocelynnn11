   // jS 09/12/2024
   // Main.java
   import myanimals.Animal;
   import myanimals.Dog;
   import myanimals.Cat;
   import mystudent.Student;
    import mystudent.App;






public class Main {
    public static void main(String[] args) {
        System.out.println(" \n Hello and welcome from the Main \n");


        // Create a Student object
        Student student = new Student();


        // Create an object from runnable class.

        App app = new App();

        // Use a method from the Student class.
        // I know that I have a static method in the Student class.
        // and i know how to call a static Class method

        Student.sayHello();

        // Call a method that belongs to the student object.
        student.sayHi();



        // Output the number of animals before
        System.out.println("\n The number of animals is " + Animal.numOfAnimals);



        // Create a Cat object.
        Cat cat = new Cat();
        // use a method that is available to the Cat class object named cat.
        System.out.println("\n This sound is coming from the Cat object named cat..");
        cat.animalSound();
    // Create Dog object
        Dog dog = new Dog();
    // use a method that is available to the Dog class object named dog.
        System.out.println("\n This sound is coming from the Cat object named dog..");
        dog.animalSound();


        System.out.println(" \n the number of animals is " + Animal.numOfAnimals);
        }
    }
