package Task_6;

import java.util.Objects;

public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    public User(final String firstname, final String lastname, final int age, final String email){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return age == user.age && firstname.equals(user.firstname) && lastname.equals(user.lastname) && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age, email);
    }

    @Override
    public String toString() {
        return String.format("{'%s', '%s', %s, '%s'}", firstname, lastname, age, email);
    }
}
