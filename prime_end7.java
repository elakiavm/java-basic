public class prime_end7 {
 
    public static void main(String[] args) {
        //range
        int min = 2;
        int max = 200;
        //find all prime numbers in the given range
        for(int n=min;n<=max;n++) {
            //check if this number is prime
            if(isPrime(n)&& n % 10 == 7) {
                
                System.out.println(n);
            }
        }
    }
     
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}        
 
