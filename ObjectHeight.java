// import java.util.Scanner;
// import java.util.HashMap;
// import java.util.Map;
import javax.swing.JOptionPane;
public class ObjectHeight {
    public static void main(String [] args){
        String sec = JOptionPane.showInputDialog("Enter a time less than 4.5 seconds: ");
        double seconds=Double.parseDouble(sec);
        double height = 100.0 - (4.9* (seconds *2));
        JOptionPane.showMessageDialog(null, "The height fo the object is: "+ height + "meters", "Object Height", JOptionPane.INFORMATION_MESSAGE);
    }
    // public static void main(String [] args){
    //     HashMap<String, Double> seconds = new HashMap<String, Double>();
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter a time less than 4.5 seconds: ");
    //     seconds.put("seconds", input.nextDouble());
    //     for(Map.Entry<String, Double> t : seconds.entrySet()) {
    //         double height = 100.0 - (4.9* (t.getValue() *2));
    //         System.out.println("The height fo the object is: "+ height +" meters");
    //     }
    // }


    
}
