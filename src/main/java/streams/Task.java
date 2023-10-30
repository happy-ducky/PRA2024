package streams;

import streams.model.Human;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


// Code from https://github.com/vfarcic/java-8-exercises

public class Task {

    /**
     * EASY
     */

    public static List<String> toUpperCaseOldJava(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for (String element : collection) {
            newCollection.add(element.toUpperCase());
        }
        return newCollection;
    }

    public static List<String> toUpperCase(List<String> collection) {
        //TO DO collection.stream().//like up n function there homework
        return null;
    }

    public static List<String> transformOldJava(List<String> collection) {
        List<String> newCollection = new ArrayList<>();
        for (String element : collection) {
            if (element.length() < 4) {
                newCollection.add(element);
            }
        }
        return newCollection;
    }

    public static List<String> transform(List<String> collection) {
        // ToDo
        return null;
    }

    /**
     * MEDIUM
     */

    public static Map<String,Human> createMapOldJava(List<Human> collection) {
        Map<String,Human> people = new HashMap<>();
        for (Human element : collection) {
            people.put(element.getName(), element);
        }
        return people;
    }

    public static Map<String,Human> createMap(List<Human> collection) {
        // ToDo
        return null;
    }


    public static Human getOldestHumanOldJava(List<Human> people) {
        Human oldestHuman = new Human("", 0);
        for (Human person : people) {
            if (person.getAge() > oldestHuman.getAge()) {
                oldestHuman = person;
            }
        }
        return oldestHuman;
    }

    public static Human getOldestHuman(List<Human> people) {
        // ToDo
        return null;
    }

    /**
     * HARD
     */


    public static Map<Boolean, List<Human>> partitionAdultsOldJava(List<Human> people) {
        Map<Boolean, List<Human>> map = new HashMap<>();
        map.put(true, new ArrayList<>());
        map.put(false, new ArrayList<>());
        for (Human person : people) {
            map.get(person.getAge() >= 18).add(person);
        }
        return map;
    }

    // use partitionBy
    public static Map<Boolean, List<Human>> partitionAdults(List<Human> people) {
        // ToDo
        return null;
    }

    public static List<String> transformListOldJava(List<List<String>> collection) {
        List<String> newCollection = new ArrayList<>();
        for (List<String> subCollection : collection) {
            for (String value : subCollection) {
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    //use flatMap
    public static List<String> transformList(List<List<String>> collection) {
        // ToDo
        return null;
    }
}