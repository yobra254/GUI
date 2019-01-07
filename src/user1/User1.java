
package user1;
import javax.swing.JOptionPane;
public class User1 {

    public static void main(String[] args) {
        // TODO code application logic here
    String fn = JOptionPane.showInputDialog("Enter First Number");
    String sn = JOptionPane.showInputDialog("Enter Second Number");
    
    int num1= Integer.parseInt(fn);
    int num2= Integer.parseInt(sn);
    
    int sum = num1 + num2;
    
    JOptionPane.showMessageDialog(null,"The Answer is "+sum, "Sum",JOptionPane.PLAIN_MESSAGE);
    }
    
}
