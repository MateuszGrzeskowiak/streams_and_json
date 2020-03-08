package structures.zad1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Osoba implements Comparable<Osoba> {
    private String imie;
    private String nazwisko;
    private int wiek;

    public int compareTo(Osoba osoba) {
        return Integer.compare(wiek, osoba.getWiek());
    }



}