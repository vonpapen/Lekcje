public class Main {
    public static void main(String[] args) {

        Pracownik pr1 = new Pracownik();

        pr1.dodajPodwyzke();
        pr1.zabierzPodwyzke();
        pr1.zmienDzial();

        pr1.wyswietlPracownika();

        Pracownik pr2 = new Pracownik();
        
        pr2.dodajPodwyzke();
        pr2.zabierzPodwyzke();
        pr2.zmienDzial();

        pr2.wyswietlPracownika();
    }
}