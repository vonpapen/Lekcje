public class Main {
    public static void main(String[] args){

        Stringus ob = new Stringus();

        System.out.println("Liczba znakow: "+ob.policzZnaki());
        System.out.println(" ");
        System.out.println("Liczba bialych znakow: "+ob.policzBialeZnaki());
        System.out.println(" ");
        System.out.println("Liczba znakow bez znakow bialych: "+ob.policzZnakiBez());
        System.out.println(" ");
        ob.pokazLiczby();

        ob.policzLitery();

    }
}
