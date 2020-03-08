package structures.zad2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfertaSprzedazy implements Comparable<OfertaSprzedazy> {

    String nazwaProduktu;
    double cena;


    public int compareTo(OfertaSprzedazy oferta) {
        return Double.compare(cena, oferta.getCena());
    }

}
