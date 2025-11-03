package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> peopleMap = new HashMap<>();

        peopleMap.put("person", new Person("John", "Smith"));
        peopleMap.put("teacher", new Teacher("María", "Montessori", "Educación"));
        peopleMap.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        peopleMap.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));

        return peopleMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Person p : map.values()) {
            p.getDetails();
        }
    }

    public static void main(String[] args) {

        Map<String, Person> myMap = createHashMap();

        System.out.println("Valores iniciales del mapa:\n");
        printMapValues(myMap);

        addMapValue(myMap, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));

        System.out.println("Después de añadir una nueva persona:\n");
        printMapValues(myMap);
    }

}
