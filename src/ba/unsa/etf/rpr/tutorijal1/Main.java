package ba.unsa.etf.rpr.tutorijal1;

import java.util.Scanner;

/*

Koristeći IntelliJ IDEA napraviti projekat pod nazivom "rpr-t1-z2".
Napravite program koji na ekranu ispisuje sve brojeve između 1 i n koji su
djeljivi sa sumom svojih cifara, pri čemu se n unosi sa tastature. U programu se
obavezno treba nalaziti funkcija sumaCifara. Po završetku zadatak treba postaviti
na GitHub koristeći isključivo funkcionalnosti IntelliJ IDEA okruženja!

 */

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }


    }

    private static int sumaCifara(int broj) {
        int suma = 0;
        while (broj != 0) {
            suma += broj % 10;
            broj /= 10;
        }
        return suma;
    }
}
