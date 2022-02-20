package clasescanner;

import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {
        System.out.print("Eescribe tu nombre: ");
        Scanner sc = new Scanner(System.in);
        var usuario = sc.nextLine();
        System.out.print("Eescribe tu titulo: ");
        var titulo = sc.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }

}
