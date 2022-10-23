import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayi : ");
        int a = scanner.nextInt();
        System.out.print("İkinci Sayi : ");
        int b = scanner.nextInt();
        System.out.print("Ucuncu Sayi : ");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("c<b<a");
            } else {
                System.out.println("b<c<a");
            }
        }
        if (b > a && b > c) {
            if (a > c) {
                System.out.println("b>a>c");
            } else {
                System.out.println("b>c>a");
            }
        }
        if (c > a && c>b) {
            if (a > b) {
                System.out.println("c>a>b");
            } else {
                System.out.println("c>b>a");
            }
        }
    }
}
