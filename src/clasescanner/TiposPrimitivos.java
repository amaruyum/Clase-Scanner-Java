package clasescanner;

public class TiposPrimitivos {

    public static void main(String args[]) {
        /*
            Tipos primitivos enteros:
        byte: 8 bits - default: 0 (-128 to +127)
        short: 16 bits - default: 0 (-32.768 to 32.767)
        int: 32 bits - default: 0 (-2^31 to 2^31-1)
        long: 64bits - default: 0 (-2^63 to 2^63-1)
         */
        // convertir numeroByte = (byte)129
        byte numeroByte = (byte)129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768;
        System.out.println("Valor short: " +  numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("Valor int: " +  numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("Valor long: " +  numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        /*
            Tipos primitivos flotante:
        float: 32 bits
        double: 64 bits
         */
        
        float numeroFloat = 3.4028235E38F;
        System.out.println("Valor float: " + numeroFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("Valor double: " + numeroDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);
    }
}
