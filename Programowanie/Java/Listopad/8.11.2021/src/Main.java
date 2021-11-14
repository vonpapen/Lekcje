import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Osoba o1 = new Osoba();

        o1.pokazDane();
        o1.zmienDane();

        Osoba[] tab = new Osoba[10];

        for(int i=0;i<10;i++){
            tab[i]=new Osoba();
        }

        for(int i=9;i>=0;i--){
            tab[i].pokazDane();
        }

        Vector <Osoba> wektor = new Vector <Osoba>(0);

        int ile=-1;
        do{
            ile++;
            wektor.add(new Osoba());
        }while (wektor.elementAt(ile).nazwisko!="");
        wektor.remove(ile);
    }
}
