import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        System.out.println("Enter the Principle:");
       Scanner obj=new Scanner(System.in);
       int p=obj.nextInt();
       System.out.println("Enter the Rate");
       int r=obj.nextInt();
       System.out.println("Enter the Time");
       int t=obj.nextInt();
       System.out.println("S.I:"+(p*r*t)/100);
    }
}
