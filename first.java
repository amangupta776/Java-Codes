import java.util.Scanner;


 class sum{
void add (int a, int b){
System.out.println("Two number of sum is :"+ (a+b));
}
}
class cal extends sum{
    void sub(int a,int b){
System.out.println("Two number of sub is :"+ (a-b));
    }
}
class first{
    public static void main(String[] args) {
    
//         Scanner i =new Scanner(System.in);
//      System.out.println("Enter your age:");
//         int num =i.nextInt();
//         if(num >= 18){
// System.out.println("You are eligible for voting");
//         }
//         else{
//             System.out.println("you are not eligible for voting");
//         }
cal obj=new cal();
obj.add(40, 50);
obj.sub(40, 10);
    }
}