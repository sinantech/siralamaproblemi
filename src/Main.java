import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayi : ");
        int a = scanner.nextInt();
        System.out.print("İkinci Sayi : ");
        int b = scanner.nextInt();
        System.out.print("Ucuncu Sayi : ");
        int c = scanner.nextInt();
        int max = -1;
        int min = -2;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;

        }

        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }

        System.out.println("Maksimum Sayi : " + max);
        System.out.println("Minimum Sayi : " + min);

    }

}