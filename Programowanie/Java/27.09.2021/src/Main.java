import java.util.Scanner;
//Designed by Janek
public class Main {
    public static void main(String[] args) {

        Poczta pierwsza = new Poczta("Jan Horodecki", "ul. Nowa", "66-400","Kuba", "ul.Super", "66-400", 2 );

        System.out.println("Podaj adresata: ");
        pierwsza.adresat = getString();
        System.out.println("Podaj adres adresata: ");
        pierwsza.aAdres = getString();
        System.out.println("Podaj kod pocztowy adresata: ");
        pierwsza.aKod = getString();
        System.out.println("Podaj nadawce: ");
        pierwsza.nadawca = getString();
        System.out.println("Podaj adres nadawcy: ");
        pierwsza.nAdres = getString();
        System.out.println("Podaj kod pocztowy nadawcy: ");
        pierwsza.nKod = getString();
        System.out.println("Podaj rodzaj przesyłki (1-list, 2-paczka, 3-niestandardowa): ");
        pierwsza.rPrzesylki = getint();

        pierwsza.wyswietl();
    }

    private static String getString(){
        return new Scanner(System.in).nextLine();
    }
    private static int getint(){
        return  new Scanner(System.in).nextInt();
    }
}
