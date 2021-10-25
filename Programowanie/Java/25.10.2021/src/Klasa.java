import java.util.Scanner;

public class Klasa {
    private int[] liczba= new int[5];

    public void setLiczba(int jaka){
        System.out.println("Podaj liczbe: ");
        liczba[jaka]=getInt();
    }

    public int getSumaTablicy(){
        int suma = 0;
        for(int i=0;i<5;i++){
            suma=suma+liczba[i];
        }
        return suma;
    }

    public int getRoznicaTablicy(){
        int roznica = 0;
        for(int i=0;i<5;i++){
            roznica=roznica-liczba[i];
        }
        return roznica;
    }

    public int getIloczynTablicy(){
        int iloczyn = 1;
        for(int i=0;i<5;i++){
            iloczyn=iloczyn*liczba[i];
        }
        return iloczyn;
    }

    public float getIlorazTablicy(){
        float iloraz = (float)liczba[0];
        for(int i=1;i<5;i++){
            if(liczba[i]==0){
                iloraz=iloraz/1;
            }else {
                iloraz = iloraz / (float)liczba[i];
            }
        }
        return iloraz;
    }


    private static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}
