
package clasescanner;

public class TipoChar {
    public static void main(String args[]){
        //lista de caracteres : list unicode
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
    
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        
        var varCharDecimal1 = 33;
        System.out.println("varCharDecimal1 = " + varCharDecimal1);
    
        var varCharSimbolo1 = '!';
        System.out.println("varCharSimbolo1 = " + varCharSimbolo1);
        
        int variableEnteraaSimbolo = '!';
        System.out.println("variableEnteraaSimbolo = " + variableEnteraaSimbolo);
    }
}
