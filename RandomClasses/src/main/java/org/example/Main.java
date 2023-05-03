package org.example;

import org.example.classes.Person;

public class Main {
    public static void main(String[] args){

        Person kto_to = new Person();
        
        kto_to.setName("Andrey");
        kto_to.setSurname("Tingaev");
        kto_to.setAge(19);

        System.out.println("kto_to = " + kto_to);
        System.out.println("------------------------------------------------");
        kto_to.printPerson();
        System.out.println("------------------------------------------------");
        kto_to.prettyPrintPerson();
        
    }
}
