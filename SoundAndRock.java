import java.util.Scanner;

public class SoundAndRock {
    public static void main(String args[]){
        double t, distF, distM;
        Scanner in = new Scanner(System.in);
           System.out.println("Рow long did it take for the echo to return in seconds?");
    t = in.nextDouble();
    distF = (t * 1100)/2;
    distM = (distF * 0.3048)/2;
    System.out.println("Distance to rock " + distF+ " feet or " +distM+ " meters.");
        }
    }
    
