package com.cpw.entry;

public class PersonMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person clone = person.clone();
        System.out.println(person.toString());
        System.out.println(clone.toString());

    }
}
