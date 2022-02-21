
package clasescanner;

import java.util.Scanner;
public class ConversionTiposPrimitivos {
    public static void main(String args[]){
        //Convertir tipo String a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        
        //Convertir Double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor
          Scanner sc = new Scanner(System.in);
//        System.out.print("Ingrese tu edad: ");
//        edad = Integer.parseInt(sc.nextLine());
//        System.out.println("Su edad es: " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        //Recuperar un caracter de una cadena
        var caracter = "hola".charAt(2);
        System.out.println("caracter = " + caracter);
        System.out.println("Ingrese un caracter: ");
        caracter = sc.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
