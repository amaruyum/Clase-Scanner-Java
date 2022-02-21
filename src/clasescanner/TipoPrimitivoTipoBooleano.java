package clasescanner;

public class TipoPrimitivoTipoBooleano {

    public static void main(String args[]) {
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        }else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 30;
        
        if (edad > 18){
            System.out.println("Es mayor de Edad");
        }else{
            System.out.println("Es menor de Edad");
        }
    }
}
