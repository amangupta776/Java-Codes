import java.util.*;

public class ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList();
        a1.add(33);
        a1.add(43);
        a1.add(21);
     
    //    for(int i=0;i<a1.size();i++){
    //     System.out.println(a1.get(i));
    //    }
    // ListIterator<Integer> a2=a1.listIterator();
    
    // a2.remove();
   System.out.println(a1);
   System.out.println(a1.size());
   System.out.println(a1.contains(33));
    }
}
