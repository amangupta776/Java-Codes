import java.util.Scanner;

class temp{
    String name;
    int age;
    void input(){
Scanner obj=new Scanner(System.in);
System.out.println("Enter name:");
 name=obj.next();
System.out.println("Enter age:");
 age=obj.nextInt();

    }
    void show(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);

    }
}
public class clas {
    public static void main(String[] args) {
        temp obj=new temp();
        obj.input();
        obj.show();
    }
}
// assignment:
// 1. wap invoice billing sytem of shop using classes and constructor
// constructor is function with name of class name  initialize of class when object is created 
//you can take more than one constructor but with different argument in a class .