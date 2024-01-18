package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Pedro", LocalDate.of(2000, 2, 3));
        Person person2 = new Person("Pablo", LocalDate.of(2002, 5, 12));

        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
