import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cena = 40;
        int discount= 0;
        System.out.println("Podaj miasto: ");
        String miasto = sc.next();

        if (miasto.equals("Warszawa")) {
            cena *= 0.1;
        }


        System.out.println("Podaj wiek: ");
        int wiek = sc.nextInt();


        System.out.println("Jaki jest dzisiaj dzień?");
        String DayOfWeek = sc.next();
        DayOfWeek.toUpperCase();
        System.out.println("Jaki jest dzisiaj dzień (liczbowo): ");
        int DayOfWeekNumber = sc.nextInt();


        if (wiek < 10) {
            cena = 0;
            discount = 100;
        } else if (wiek > 10 && wiek <= 18) {
            cena = 20;
            discount = 50;
        } else cena = 40;
            discount = 0;


        if (DayOfWeek.equals("Czwartek")) {
            cena = 0;
            discount = 100;
        } else if (DayOfWeek.equals("Czw")) {
            cena = 0;
            discount = 100;
        }
        if (DayOfWeekNumber == 4) {
            cena = 0;
            discount = 100;
        }
        int finalPrice = cena - (cena*discount/100);
        System.out.println("Data: " + miasto + ", " + wiek + " years old " + ", "  + "weekday Ticket price: " + finalPrice + " PLN ");
        System.out.println("Discount: " + discount + "%");
    }


}