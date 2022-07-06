package se.oopInheritance;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Test", LocalDate.MIN);

        //p1.toString(); //inherited method

        Employee e1 = new Employee("Lucky", LocalDate.MAX, 20_000, LocalDate.MIN);

        //e1.getName();

        //Programmer is an Employee and a Person
        Programmer tomHacker = new Programmer("Tom the White Hat", LocalDate.of(1973, 5,2), 45_000,LocalDate.parse("1996-01-05"), new String[]{"c++", "ruby", "java", "assembly",
                "fortran", "python", "lua", "ada"}, new String[]{"OCA", "OCP", "OCE", "OCM"});
        System.out.println(Arrays.toString(tomHacker.getCertificates())); //[OCA, OCP, OCE, OCM]
        System.out.println(tomHacker);//Programmer{languages=[c++, ruby, java, assembly, fortran, python, lua, ada], certificates=[OCA, OCP, OCE, OCM]}
        System.out.println(tomHacker.getName()); //Tom the White Hat


        Employee employeeTom = new Programmer(
                "Tom the White Hat",LocalDate.of(1976,2,29),
                45_000, LocalDate.parse("1997-05-01"),
                new String[]{"c++", "ruby", "java", "assembly",
                        "fortran", "python", "lua", "ada"},
                new String[]{"OCA", "OCP", "OCE", "OCM"}
        );
        System.out.println(employeeTom.toString());//because we override it in programmer class so we do not need to call toString method here. (redundant)
                                                   //Programmer{languages=[c++, ruby, java, assembly, fortran, python, lua, ada], certificates=[OCA, OCP, OCE, OCM]}
        System.out.println(employeeTom.getName()); //Tom the White Hat

        // casting and promoting a program
        Programmer backToNormal = (Programmer) employeeTom;
        System.out.println(employeeTom.getName()); //Tom the White Hat
        System.out.println(backToNormal);//Programmer{languages=[c++, ruby, java, assembly, fortran, python, lua, ada], certificates=[OCA, OCP, OCE, OCM]}

        p1.printDescription(); //Person with Name and BirthDate
        tomHacker.printDescription();//Print programmer information: Tom the White Hat has salary: 45000.0 also has certificates : [OCA, OCP, OCE, OCM]
        employeeTom.printDescription();//Print programmer information: Tom the White Hat has salary: 45000.0 also has certificates : [OCA, OCP, OCE, OCM]
        backToNormal.printDescription();//Print programmer information: Tom the White Hat has salary: 45000.0 also has certificates : [OCA, OCP, OCE, OCM]
        e1.printDescription();// because we didnt initialize printDescription method in Employee class, so it will print out printDescription in Person class.
                              //out put : Person with Name and BirthDate.





    }
}
