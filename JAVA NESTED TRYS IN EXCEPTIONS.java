public class Main{
    public static void main(String[] args){
    try{
        try{
        int a = 50/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
            
        }
        System.out.println("\nrest of code ");
    try{
        int[] a = new int[4];
        a[5]=4;
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }
    System.out.println("\nrest of code 2");
    }
 catch(Exception e){
        System.out.println("\n handled........");
    }
    }}
    
