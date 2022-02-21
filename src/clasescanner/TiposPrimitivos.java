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
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);
        
    }
}
