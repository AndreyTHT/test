package org.example.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {

    private String surname;
    private String name;
    private int age;

    public Person() {

    }

    public void printPerson(){
        System.out.println("Фамилия: " + surname);
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    public void prettyPrintPerson(){
        System.out.println(surname+' '+name+' '+age+' '+"лет");
    }
}
