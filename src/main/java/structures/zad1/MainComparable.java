package structures.zad1;

import java.util.*;

public class MainComparable {
    public static void main(String[] args) {

        List<Osoba> list = new ArrayList<>(Arrays.asList(

        new Osoba("Marek", "Markowski", 27),
        new Osoba("Michał", "Kowalski", 30),
        new Osoba("Kamil", "Nowak", 12),
        new Osoba("Paweł", "Kamilski", 65),
        new Osoba("Marian", "Kordas", 22)
        ));

        list.forEach(System.out::println);
        System.out.println();

      Collections.sort(list);


        list.forEach(System.out::println);
        System.out.println();
    }
}
