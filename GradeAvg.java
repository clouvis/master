import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class GradeAvg {
    public static void main (String []args){
        NumberFormat percent = NumberFormat.getPercentInstance();
        HashMap<String, Integer> grades = new HashMap<String, Integer>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter grade in Math: ");
            grades.put("Math", sc.nextInt());
            System.out.print("Enter grade in Filipino: ");
            grades.put("Filipino", sc.nextInt());
            System.out.print("Enter grade in Science: ");
            grades.put("Science", sc.nextInt());
            System.out.print("Enter grade in English: ");
            grades.put("English", sc.nextInt());
            System.out.print("Enter grade in Social: ");
            grades.put("Social", sc.nextInt());
        }
        System.out.println("==================================\n");
        System.out.format("%-10s %15s", "Subject", "Grade\n");
        float sum = 0.0f;
        for(Map.Entry<String, Integer> grade : grades.entrySet()) {
            System.out.format("%-10s %13s", grade.getKey(), grade.getValue() + "\n"); 
            sum += grade.getValue();
        }
        float average = (sum / 5) / 100;
        System.out.format("%-10s %13s", "Average: ", percent.format(average));

        
    }
}