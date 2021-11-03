import java.util.Scanner;

public class Human {

    private String name;
    private int age;
    private  int weight;
    private int height;
    private String sex;



    public void getAge(){
        System.out.println("Podaj wiek: ");
        int wiek = getint();
        age = wiek;
    }

    public void getWeight(){
        System.out.println("Podaj wage: ");
        int waga = getint();
        weight = waga;
    }

    public void getHeight(){
        System.out.println("Podaj wzrost: ");
        int wzrost = getint();
        height = wzrost;
    }

    public void getName(){
        System.out.println("Podaj imie: ");
        String imie = getString();
        name = imie;
    }

    public void isMale(){
        System.out.println("Podaj plec: ");
        String plec = getString();
        sex=plec;
    }

    public void wyswietl(){
        System.out.println("Imie: "+name);
        System.out.println("Waga: "+weight);
        System.out.println("Wzrost: "+height);
        System.out.println("Wiek: "+age);
        System.out.println("Plec: "+sex);
    }

    private String getString(){
         return new Scanner(System.in).next();
    }
    private int getint(){
        return  new Scanner(System.in).nextInt();
    }
}
