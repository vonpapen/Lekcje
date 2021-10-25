public class Main {
    public static void main(String[] args){
        Klasa obiekt = new Klasa();

        for(int i=0;i<5;i++){
            obiekt.setLiczba(i);
        }

        System.out.println(obiekt.getSumaTablicy());
        System.out.println(obiekt.getRoznicaTablicy());
        System.out.println(obiekt.getIloczynTablicy());
        System.out.println(obiekt.getIlorazTablicy());
    }
}
