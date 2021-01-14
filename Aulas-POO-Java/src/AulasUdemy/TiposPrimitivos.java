package AulasUdemy;

public class TiposPrimitivos 
{
    
    public static void main(String[] args)
    {
    byte num1 = 1;
    short num2 = 2;
    int num3 = 3;
    long num4 = 4l;
    float num5 = 3.4f;
    double num6 = 544;
    
    System.out.println("Byte: " + Byte.SIZE);
    System.out.println("Byte min: " + Byte.MIN_VALUE);
    System.out.println("Byte max: " + Byte.MAX_VALUE);
    pulaLinha();
    System.out.println("Short: " + Short.SIZE);
    System.out.println("Short min: " + Short.MIN_VALUE);
    System.out.println("Short max: " + Short.MAX_VALUE);
    pulaLinha();    
    System.out.println("Int: " + Integer.SIZE);
    System.out.println("Int min: " + Integer.MIN_VALUE);
    System.out.println("Int max: " + Integer.MAX_VALUE);
    pulaLinha();    
    System.out.println("Long: " + Long.SIZE);
    System.out.println("Long min: " + Long.MIN_VALUE);
    System.out.println("Long max: " + Long.MAX_VALUE);
    pulaLinha();
    System.out.println("Float: " + Float.SIZE);
    System.out.println("Float min: " + Float.MIN_VALUE);
    System.out.println("Float max: " + Float.MAX_VALUE);
    pulaLinha();
    System.out.println("Double: " + Double.SIZE);
    System.out.println("Double min: " + Double.MIN_VALUE);
    System.out.println("Double max: " + Double.MAX_VALUE);
    pulaLinha();
    }

    public static void pulaLinha()
    {
        System.out.println(" ");
    }
}