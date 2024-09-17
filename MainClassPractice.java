// jS 09/17/2024
// MainClassPractice.java

public class MainClassPractice {
    public static void main(String[] args) {
        System.out.println("\n Welcome to my OOP Class Practice Program!\n");



        // Create a couple Dog objects
        // with an empty arguments (no args)
        Dog myDog = new Dog();
        Dog anotherDog = new Dog();

        // Create a dog with a String name
        Dog aDog= new Dog(" Spot ");

        //output the new Dog object's
        System.out.println("\n The new dog's name is : " + aDog.getName() );


        // Create a fourth dog with an int age.
        Dog fourthDog = new Dog(33);

        // output the dog's age.
        System.out.println("\n my new dog's age is: " + fourthDog.setAge());
        Dog fithDog = new Dog( " my new dog's name ",  7);


        // validate it
        System.out.println(" my last dog's name is " + fithDog.getName() + " and age is : " + fithDog.setAge());

        // give our dog a birthday (add a year to this age)
        fithDog.setAge(fithDog.setAge() + 1);
        System.out.println(" My dog, who is named: " + fithDog.getName() + ", had a birthday and age is now: " + fithDog.setAge());
    }
}