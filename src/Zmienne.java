public class Zmienne {
    public static void main(String[] args) {
        System.out.println();

        int liczba1;
        liczba1 = 13;

        double liczba2 = 23.7;

        System.out.println("Moja liczba to " + liczba1);

        liczba1 = (int)liczba2;
        //liczba2 =liczba1;

        System.out.println(liczba1);


        int workHoursPerYear;
        int hours = 8;
        int daysInWeek = 5;
        int weeks = 52;


        workHoursPerYear = hours * daysInWeek * weeks;
        System.out.println("Liczba1 wynosi " + liczba1 +
                "dni pracujące " + workHoursPerYear);

        String napis = "Dzisiaj jest\t \"ładna\" pogoda\n";

        System.out.println(napis + " to jest mój napis");
        System.out.print(napis + " to \n jest mój napis \n");
        System.out.print(napis + " to jest mój napis \n");

        char znak = '#';

        boolean slonce = true; //false
        System.out.println(slonce);

    }
}
