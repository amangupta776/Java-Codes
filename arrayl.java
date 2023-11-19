import java.util.ArrayList;
import java.util.Scanner;

public class arrayl {
    public static void main(String[] args) {
    ArrayList<String> s1=new ArrayList<>();
    Scanner ss=new Scanner(System.in);
    
    s1.add(0, "aman");
    s1.add(1, "gupta");
    s1.add(0, "hello");
    for(int i=0;i< s1.size() ;i++){
System.out.println(s1.get(i));
    }
    }
}
