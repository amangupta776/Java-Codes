import java util.Scanner;
public class a {
    public static void main(String []agrs){
        int simpleinterest;
      Scanner sc=new Scanner(System.in);

      int rate=sc.nextInt();
      int principal=sc.nextInt();
      int time=sc.nextInt();
      
      simpleinterest=rate*principal*time/100;
      System.out.println("Simpleinterest"+simpleinterest);

    }

}