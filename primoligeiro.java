import java.util.Scanner;

public class primoligeiro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long casos = sc.nextLong();
        
        for (int i = 0; i < casos; i++){
            long x = sc.nextLong();

            if(ehPrimo(x) == true){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }

        sc.close();

    }

    public static boolean ehPrimo(long x){
        
        if (x <= 1) return false;
        if ( x == 2) return true;
        if (x % 2 == 0) return false;

        long limite = (long) Math.sqrt(x);

        for (long i = 3; i <= limite; i += 2){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }   
}
