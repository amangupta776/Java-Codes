import java.util.Scanner;

public class areaofcircle {

    public static void main(String[] args) {
        double p=3.14;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter radius:");
    int r=obj.nextInt();
    System.out.println("Area of circle:"+p*r*r);
    }
}
