public class sbuilder {
    public static void main(String[] args) {
        StringBuilder obj=new StringBuilder("hello");
        System.out.println(obj.capacity());
        System.out.println(obj.delete(0, 1));
        
    }
}
