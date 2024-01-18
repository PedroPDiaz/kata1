package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthday;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age() +
                '}';
    }

    private int age() {
        int age = (int) (LocalDate.now().toEpochDay() - getBirthday().toEpochDay());
        return age/365;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
