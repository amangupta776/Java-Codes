import java.util.ArrayList;

public class arrl {
    public static void main(String[] args) {
        ArrayList aa=new ArrayList<>();
        aa.add(11);
        aa.add("hello");
        aa.add('j');
        for(int i=0;i<aa.size();i++){
            System.out.println(aa.get(i));
        }
    }
}
