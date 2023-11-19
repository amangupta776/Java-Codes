import java.util.*;

public class priorityqueu {
    public static void main(String[]agrs){
        PriorityQueue<String> A1= new PriorityQueue<>();
        A1.add("apple");
        A1.add("orange");
        A1.add("grapes");
        A1.poll();
        A1.remove();
        A1.next();
        System.out.println(A1);
    }
}
