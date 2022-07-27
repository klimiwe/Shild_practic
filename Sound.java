import java.util.Scanner;

public class Sound {
    public static void main(String args[]){
    double t, distF, distM;
    Scanner in = new Scanner(System.in);
       System.out.println("What time in second from lightning to thunder in second?");
t = in.nextDouble();
distF = t * 1100;
distM = distF * 0.3048;
System.out.println("Distance to lightning " + distF+ " feet or " +distM+ " meters.");
    }
}
