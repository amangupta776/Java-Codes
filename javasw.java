import javax.swing.*;
import java.awt.*;
public class javasw {
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(500, 500);
        obj.setTitle("helloworld");
        obj.setResizable(false);
        Container c=obj.getContentPane();
        JButton obj1=new JButton("click me");
        obj1.setSize(20,30);
        obj.setLocation(100,20);
        c.add(obj1);


    }
}
