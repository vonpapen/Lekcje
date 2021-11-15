public class Student {
    public String imie;
    public String nazwisko;
    public int numer_indeksu;
    public int rokStudiow;
    public String[] przedmioty = new String[50];

    //zmienna pomocnicza
    private int iloscPrzedmiotow;

    Student(String imie, String nazwisko, int numer_indeksu, int rok, String[] przedmioty){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.numer_indeksu=numer_indeksu;
        this.rokStudiow=rok;

        for(int i=0;i< przedmioty.length;i++){
            this.przedmioty[i]=przedmioty[i];
        }

        iloscPrzedmiotow=przedmioty.length;
    }

    Student(String imie,String nazwisko, int numer_indeksu, int rok, String przedmioty){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.numer_indeksu=numer_indeksu;
        this.przedmioty[0]=przedmioty;

        iloscPrzedmiotow=1;
    }

    public void getInformacje(){
        System.out.println("Imie: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Numer indeksu: "+numer_indeksu);
        System.out.println("Rok studiow: "+rokStudiow);

        System.out.println("Przedmioty: ");
        for(int i=0;i<iloscPrzedmiotow;i++){
            System.out.println((i+1)+". "+przedmioty[i]);
        }
    }

    public String getImieNazwisko(){
        return imie+" "+nazwisko;
    }

    public int getNumerIndeksu(){
        return numer_indeksu;
    }

    public int getRok(){
        return rokStudiow;
    }

    public void zwiekszRok(){
        rokStudiow+=1;
    }

    public void setPrzedmiot(String przedmiot){
        przedmioty[iloscPrzedmiotow]=przedmiot;
        iloscPrzedmiotow+=1;
    }
}
