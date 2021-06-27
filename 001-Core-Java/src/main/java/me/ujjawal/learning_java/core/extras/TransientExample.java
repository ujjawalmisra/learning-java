package me.ujjawal.learning_java.core.extras;

import java.io.Serializable;

/**
 * struct Person {
 *     char[50] name;
 *     int age;
 *     int pulse;
 * }
 *
 * struct Person *p = malloc(sizeof(Person));
 * p->name = "Deepjyoti";
 * p->age = 21;
 * p->pulse = 60;//70,80,60
 *
 * int *fd = open('/tmp/persons.txt', 'wb');
 * fd->write(p);// fd->write(p->name); fd->write(p->age);
 * fd->close();
 *
 * int *fd = open('/tmp/persons.txt', 'rb');
 * Person *p = malloc(sizeof(Person));
 * p = fd->read(sizeof(Person));
 * fd->close();
 */
public class TransientExample {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Deepjyoti";
        p.age = 21;
        //Write to a file or Transmit of network
        // File - F1 -- Person
        // Person (+ email)
        // File - F2 -- Person
    }


    static class Person implements Serializable {

        private static final long serialVersionUID = 1L;

        private String name;
        private int age;
        private transient int pulse;
    }
}
