import java.util.Scanner;

public class Kalkulator
{

    private Dzialanie coRobic;

    public Kalkulator()
    {
        this.coRobic = coRobic;
    }



    public static void main(String[] args)
    {
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("WITAJ W KALKULATORZE");
        System.out.println("wczytaj do 5 liczb jesli chcesz wczytać np. dwie w pozostałych miejscach pisz 1");

        double a, b, c, d, e;

        System.out.println("\nwpisz pierwszą liczne");
        Scanner skaner = new Scanner(System.in);
        a = skaner.nextDouble();
        System.out.println("wpisz drugą liczbe");
        b = skaner.nextDouble();
        System.out.println("wpisz trzecią liczbe");
        c = skaner.nextDouble();
        System.out.println("wpisz czwartą liczbe");
        d = skaner.nextDouble();
        System.out.println("wpisz piątą liczbe");
        e = skaner.nextDouble();

        System.out.println("wybierz operację: \ndodawanie: add \nodejmowanie: divide \nmnozenie: multiply \ndzielenie: subtract ");

        switch (kalkulator.coRobic){
            case add:
                System.out.printf("wynik dodawanie to >> %.4f << \n", dodawanie(a, b, c, d, e));
                break;
            case divide:
                System.out.printf("wynik odejmowania to >> %.4f << \n", odejmowanie(a, b, c, d, e));
                break;
            case multiply:
                System.out.printf("wynik mnożenia to >> %.4f << \n", mnozenie(a, b, c, d, e));
                break;
            case subtract:
                System.out.printf("wynik dzielenia to >> %.4f << \n", dzielenie(a, b, c, d, e));
                break;

        }

    }

    public static double dodawanie(double a, double b, double c, double d, double e)
    {
        double wynik = a + b + c + d + e;

        return wynik;
    }

    public static double odejmowanie(double a, double b, double c, double d, double e)
    {
        double wynik = a - b - c - d - e;

        return wynik;
    }

    public static double mnozenie(double a, double b, double c, double d, double e)
    {
        double wynik = a * b * c * d * e;

        return wynik;
    }

    public static double dzielenie(double a, double b, double c, double d, double e)
    {
        double wynik = a / b / c / d / e;

        return wynik;
    }

    }
}