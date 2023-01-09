package listbasics;

import listbasics.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    printPersons();
    }

    public static void printPersons(){

        //create list of persons
        List<Person> person = new ArrayList<>();

        //add at least 3 persons
        person.add(new Person(2));
        person.add(new Person(4));
        person.add(new Person(6));

        //print all ages
        System.out.println(person);
    }
}