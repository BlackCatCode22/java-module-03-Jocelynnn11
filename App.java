// jS 09/10/2024
//App.java
// String point to create objects from my classes

public class App {
    public static void main(String[] args) {
        System.out.println("\n\nWelcome to classes and object-oriented programming!\n");

        Student myNewStudent = new Student();

        myNewStudent.age = 64;
        myNewStudent.gpa = 3.4;
        myNewStudent.major= "History";
        myNewStudent.firstName = "Jocelyn";
        myNewStudent.lastName = "Sandoval";
        myNewStudent. onProbation = true;

        // Output some stuff about our new object

        System.out.println("\n The first name of our student is: "  + myNewStudent.firstName +"\n\n");

        // Create two more students .
        Student anotherStudent = new Student();
        Student oneMoreStu = new Student();

        oneMoreStu.major = "History";
        anotherStudent.age =44;

        // How many Students?
        System.out.println("\n There were "+ Student.numOfStudents + " objects created!");

        // Create phone object
        Phone myNewPhone = new Phone();
        myNewPhone.model = "Pixel 8";
        myNewPhone.numOfCameras = 3;

        System.out.println("\n myNewPhone has " + myNewPhone.numOfCameras + " cameras " );




        // Create a Cat
        Cat myCat = new Cat();
        myCat.age = 3;
        myCat.name = "Grumpy";
        myCat.livesRemaining = 0;
        myCat.meow();
        System.out.println("\n my cat is " + myCat.age + " years old. ");




        }


        }

