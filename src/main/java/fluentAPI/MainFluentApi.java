package fluentAPI;

import fluentAPI.interfaces.Title;
import fluentAPI.model.Person;
import fluentAPI.model.PersonBuilder;

public class MainFluentApi {

    public static void main(String[] args) {

        //Package-private constructor is not accessible here, we must use the builder:
        //Person p = new Person("a", Title.PROF);

        PersonBuilder builder = new PersonBuilder();
        Person adam = builder.withName("Adam")
                .withTitle(Title.PROF)
                .build();

        Person kasia = builder.withName("Kasia")
                .withTitle(Title.PROF)
                .build();

        Person zenon = builder.withName("Zenon")
                .withTitle(Title.PROF)
                .build();

        adam.addFriend(kasia)
                .addFriend(zenon)
                .sayHelloToFriends();

        adam.processFriends(a -> {a.clear(); return a;});
        adam.sayHelloToFriends();

        adam.processFriendsInPlace(a -> a.clear())
                .sayHelloToFriends();

        adam.addFriend(kasia)
                .sayHelloToFriends()
                .chooseBestFriend(a -> a.get(0))
                .sayHelloToFriends()
                .addFriend(zenon)
                .sayHelloToFriends(); //nic sie nie wypisuje bo chooseBestFriend oddaje Kasie a nie Adama a ona nie ma przyjaciół
    }
}