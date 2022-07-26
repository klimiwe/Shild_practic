import java.util.Scanner;

public class Hypotenuse {
    public static void main(String args[]){
double x, y, z;
Scanner in = new Scanner(System.in);

System.out.println("Input first leg lenth ");
x = in.nextDouble();
System.out.println("Input second leg lenth ");
y = in.nextDouble(); 

z = Math.sqrt(x*x+y*y);
System.out.println("Hypotenuse is " + z);
}
}
