package se.collections;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String ssn;
    private String name;
    private String email;
    private LocalDate birthdate;

    public Person(String ssn, String name, String email, LocalDate birthdate) {
        this.ssn = ssn;
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    // check if 2 Person is the same person or not. If 2 persons has same Ssn, getName, getEmail, getBirthday, so they are same person
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false; // what Simon did: if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getSsn(), person.getSsn()) && Objects.equals(getName(), person.getName()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getBirthdate(), person.getBirthdate());
    // return here what features that 2 people need to be equal so we can say that 2 people is same person.
    }

    // set if persons have same Ssn, getName, getEmail, getBirthday , so they have same hashcode
    @Override
    public int hashCode() {
        return Objects.hash(getSsn(),getName(),getBirthdate(),getEmail()); //if unique person has any unique feature, we can set the feature here, so if other feature
        // is different, they are till same person
    }

    @Override
    public String toString() {
        return "Person{" +
                "ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
