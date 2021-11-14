import java.util.Scanner;

public class Osoba {
    public String imie;
    public String nazwisko;

    Osoba(){
        System.out.println("Podaj imie osoby: ");
        imie=getString();
        System.out.println("Podaj nazwisko osoby: ");
        nazwisko=getString();
    }

    public String pokazDane(){
        System.out.println(imie+" "+nazwisko);
        return imie+" "+nazwisko;
    }

    public void zmienDane(){
        System.out.println("Podaj nowe imie: ");
        imie=getString();
        System.out.println("Podaj nowe nazwisko: ");
        nazwisko=getString();
    }

    private static String getString(){
        return new Scanner(System.in).nextLine();
    }
}
