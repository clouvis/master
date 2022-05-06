import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class PizzaCost {
    public static void main(String [] args){
        HashMap<String, Double> in = new HashMap<String, Double>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the diameter of the pizza is: ");
            in.put("inch", sc.nextDouble());
        }
        for(Map.Entry<String, Double> inches : in.entrySet()) {
            double labor_cost = 0.75, rent_cost = 1.00;
            double mat_cost = 0.05 * (inches.getValue()*inches.getValue());
            double cost = mat_cost + rent_cost + labor_cost;
            System.out.println("The cost of making the pizza is: $"+ cost);
        }
    }
}