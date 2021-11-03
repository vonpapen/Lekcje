public class Kalkulator {

    private float s;
    private float r;
    private float i;
    private float iloraz;


    Kalkulator(float a, float b){
        s=suma(a,b);
        r=roznica(a,b);
        i=iloczyn(a,b);
        iloraz=iloraz(a,b);
    }

    Kalkulator(){
        s=suma(5,7);
        r=roznica(5,7);
        i=iloczyn(5,7);
        iloraz=iloraz(5,7);
    }


    private float suma(float a, float b){
        return a+b;
    }

    private float roznica(float a, float b){
        return  a-b;
    }

    private float iloczyn(float a, float b){
        return a*b;
    }

    private float iloraz(float a, float b){
        return a/b;
    }
}
