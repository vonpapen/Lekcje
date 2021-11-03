import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        System.out.println("Podaj rozmiar tablicy: ");
        n=getint();

        int[] tab = new int[n];

        int temp;
        boolean czy=true;
        for(int i=0;i<n;i++){
            System.out.println("Podaj "+(i+1)+" element tablicy: ");
            temp=getint();

                for(int j=0;j<n;j++){
                    if(temp==tab[j]){
                        czy=false;
                        break;
                    }else{
                        czy=true;
                    }
                }

                if(czy==false){
                    System.out.println("Liczba się pwotórzyła! Podaj ją ponownię");
                    i--;
                }else{
                    tab[i]=temp;
                }
        }

        System.out.println("Wprowadzone liczby: \n");
        for(int i=0;i<n;i++){
            System.out.println(tab[i]+" ");
        }
    }

    private static int getint(){
        return  new Scanner(System.in).nextInt();
    }
}
