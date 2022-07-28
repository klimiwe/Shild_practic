public class LogicalOpTable {
    public static void main(String args[]){
boolean p, q;
System.out.println("P\tQ\tAND\tOr\tXOR\tNOT");
    p=true;
    q=true;
    System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t"+ (p^q) + "\t" + (!p) + "\n");
    //System.out.print((p&q) + "\t" + (p|q));
    p=true;
    q=false;
    System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t"+ (p^q) + "\t" + (!p) + "\n");

    p=false;
    q=true;
    System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t"+ (p^q) + "\t" + (!p) + "\n");
    p=false;
    q=false;
    System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t"+ (p^q) + "\t" + (!p) + "\n");
}
}
