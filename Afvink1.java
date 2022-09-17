import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class Afvink1 {
    public static void main(String[] args)
    {
        System.out.println("\n Hello World ");
        JOptionPane.showMessageDialog(null, "Hello, World!");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name");
        String name = myObj.nextLine();
        System.out.println("hello " + name);
        JOptionPane.showMessageDialog(null, "Hello " + name);

        JTextField jt01 = new JTextField("hello, this is a textfield example");
        JLabel jl01 = new JLabel("Label example");
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(jl01,BorderLayout.WEST);
        panel.add(jt01,BorderLayout.CENTER);
        panel.setSize(300, 300);
        JFrame frame = new JFrame("textfield");
        frame.add(panel);
        frame.setSize(300,300);
        frame.show();

    }
}
