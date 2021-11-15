public class Main {
    public static void main(String[] args){

        Student ob = new Student("Jan","Horodecki",12,2021, new String[]{"Matematyka","Polski","Programowanie"});
        Student ob2 = new Student("jakub","Karasinski",13,2021,"Programowanie obiektowe");

        System.out.println(ob.getImieNazwisko());
        System.out.println(ob.getNumerIndeksu());
        System.out.println(ob.getRok());

        ob.zwiekszRok();

        ob.setPrzedmiot("Witryny Internetowe");

        ob.getInformacje();
    }
}
