/*Losowanie lotto
        Za pomocą obiektu typu Scanner, wczytaj 6 liczb wprowadzonych przez użytkownika.
        Następnie przeprowadź losowanie 6 liczb z zakresu 1-49. Sprawdź ile liczb wpisanych przez użytkownika, pokryło się z liczbami wylosowanymi.

        Etapy dodatkowe:
        1) zadbaj aby użytkownik wprowadzał liczby z zakresu 1-49
        2) wprowadzone liczby przez użytkownika powinny być unikalnie, odpowiednia wiadomość przy próbie wprowadzenie dwóch tych samych liczb
        3) wylosowane liczby powinny być unikalne*/

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 6 ){
                    numbers.add(input.nextInt());
        }


        Random random = new Random();
        Set<Integer> lottoNumbers = new HashSet<>();
        while (lottoNumbers.size() < 6) {
            lottoNumbers.add(random.nextInt(49) + 1);
        }

        int counter = 0;
        for (Integer numb : numbers) {

            if (lottoNumbers.contains(numb)) {
                counter++;
            }

        }
        System.out.println(counter);
        System.out.println(lottoNumbers);

    }
}
