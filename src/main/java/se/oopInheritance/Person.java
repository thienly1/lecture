package se.oopInheritance;

import java.time.LocalDate;

//Person is a class, subclass of object
public class Person extends  Object { // extends Object is redundant, already there
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        super(); // optional is redundant
        this.name = name;
        this.birthDate = birthDate;
    }
    public void printDescription(){
        System.out.println("Person with Name and BirthDate");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
