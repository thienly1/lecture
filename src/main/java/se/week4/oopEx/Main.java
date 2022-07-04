package se.week4.oopEx;

import java.util.Arrays;

public class Main {

    //Fields
    public static int number1 = 10;

    public static void main(String[] args) {
        Car Audi = new Car("2004", "XXL");
        System.out.println(Audi.drive());

        Rectangle square = new Rectangle(5, 8);
        System.out.println(square.getArea());
        Rectangle square2 = new Rectangle();
        System.out.println(square2.getArea());

        BankAccount Ly = new BankAccount(200_000, "Ly Ta", "thienlysph@gmail.com", "07655557887");
        System.out.println(Ly.getInformation());
        BankAccount Ari = new BankAccount(500_000, "Ari Svensson", "Svensson@gmail.com", "076635647");
        System.out.println(Ari.getInformation());

            Ly.setWithdraw(12_000);
            Ly.setFee(0.02);
            Ly.setDeposit(15_000);
            System.out.println(" customer "+ Ly.getCustomerName()+ " has current balance: " + Ly.getBalance());

       Book book1 = new Book("book1", "Nuray", "female", "Comedy");
       Book book2 = new Book("book2", "Nuray", "female", "Fiction");
       Book book3 = new Book("book3", "Suat", "male", "Fiction");
        Book book4 = new Book("book4", "Adi", "female", "Novel");
        Book book5 = new Book("book5", "Adi", "female", "Comedy");

        System.out.println();
        String []authors = new String[book5.getBookCounter()+1];
        authors[book1.getBookCounter()] = book1.getAuthorName();
        authors[book2.getBookCounter()] = book2.getAuthorName();
        authors[book3.getBookCounter()] = book3.getAuthorName();
        authors[book4.getBookCounter()] = book4.getAuthorName();
        authors[book5.getBookCounter()] = book5.getAuthorName();
        System.out.println(Arrays.toString(authors));


        method1(); //access in a static way
        Main.method1(); //access in a static way

        // instanceMethod() or instance() // compile error
        Main main = new Main(); // instantiating an object.
        main.instanceMethod(); // it is doable now.
        System.out.println(number1); // 10
        System.out.println(Main.number1); //10

        System.out.println(VolvoCar.brand); //prints static field = Volvo.
        VolvoCar v70 = new VolvoCar(); //Instance of a Car saved in a variable names v70.
        v70.model = "v70";
        v70.regNumber = "ABC7655";
        System.out.println(v70.getInformation()); //Brand: Volvo Model: v70 RegistrationNumber: ABC7655

        VolvoCar xc90 = new VolvoCar();
        xc90.model = "xc90";
        xc90.regNumber = "CBA123";
        System.out.println(xc90.getInformation());

        VolvoCar.brand = "VOLVO CARS"; // changes the value in all instances of all volvo car
        System.out.println("Changes the brand name.");

        System.out.println(v70.getInformation());// Brand: VOLVO CARS Model: v70 RegistrationNumber: ABC7655
        System.out.println(xc90.getInformation());//Brand: VOLVO CARS Model: xc90 RegistrationNumber: CBA123

    }
    public static void method1(){
        System.out.println("Static method");

//        instanceMethod(); // Can not call instance method
    }

    public void instanceMethod(){
        System.out.println("Instance Method");

        method1(); // Inside an instance method you can call a static method
    }
}
