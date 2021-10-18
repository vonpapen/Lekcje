import java.util.Scanner;

public class Pracownik {
    public String imie;
    public String nazwisko;
    public float placa;
    public String plec;
    public int dzial;

    Pracownik(){
        System.out.println("Podaj imie pracownika:" );
        imie=getString();
        System.out.println("Podaj nazwisko pracownika:" );
        nazwisko=getString();
        System.out.println("Podaj place pracownika: ");
        placa=getfloat();
        System.out.println("Podaj plec (M-Mezczyzna, K-Kobieta): ");
        plec=getString();
        System.out.println("Podaj dzial pracownika (1-5): ");
        dzial=getInt();
    }

    public void wyswietlPracownika(){
        System.out.println(imie+" ");
        System.out.println(nazwisko+" ");
        System.out.println(placa+" ");
        System.out.println(plec+" ");
        System.out.println(dzial+" ");
    }

    public float dodajPodwyzke(){
        System.out.println("Nowa placa pracownika: \n");
        wyswietlPracownika();
        placa+=100;
        System.out.println("\nPo zabraniu podwyzki wynosi: "+placa);
        return placa;
    }

    public float zabierzPodwyzke(){
        System.out.println("Nowa placa pracownika: \n");
        wyswietlPracownika();
        placa-=100;
        System.out.println("\nPo zabraniu podwyzki wynosi: "+placa);
        return placa;
    }

    public int zmienDzial(){
        System.out.println("Zmiana dzialu pracowika: ");
        wyswietlPracownika();
        System.out.println("Podaj nowy dzial pracownika: ");
        dzial=getInt();
        return dzial;
    }

    private static String getString(){
        return new Scanner(System.in).nextLine();
    }
    private static float getfloat() {
        return new Scanner(System.in).nextFloat();
    }

    private static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
