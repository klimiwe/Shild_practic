public class PrimeNumbers {
    public static void main(String args[]){
int x = 2, y;
boolean isPrime;

for (x = 2; x<100; x++){
isPrime = true;
    for (y=2; y<=x/y; y++)
        if ((x%y) == 0) isPrime = false;  
    
    if (isPrime) System.out.println(x);
    }
}
    }

