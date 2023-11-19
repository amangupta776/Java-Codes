class temp4 //outer class
{
private int a=5;
class B{ //inner class
void show(){
System.out.println("value:"+a);}
}


public static void main(String args[])
{
temp4 p=new temp4();
temp4.B q=p.new B(); //create a inner class object with help of outer object othe class
q.show();

}
}