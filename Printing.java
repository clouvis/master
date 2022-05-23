import java.text.DecimalFormat;
import java.util.Scanner;
public class Printing {
    public static void main(String [] args) {
        int copies;
        double price = 0.0, totalcost = 0.0;
        DecimalFormat df = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of copies to be printed: ");
        copies = sc.nextInt();
        if(copies>=0 && copies<=99){
            price = 0.30;
            totalcost = price*copies;
        }else if(copies>=100 && copies<=499){
            price = 0.28;
            totalcost = price*copies;
        }else if(copies>=500 && copies<=749){
            price = 0.27;
            totalcost = price*copies;
        }else if(copies>=750 && copies<=1000){
            price = 0.26;
            totalcost = price*copies;
        }else if(copies>1000){
            price = 0.25;
            totalcost = price*copies;
        }else{
            System.out.println("Invalid input!");
        }
        System.out.println("Price per copy is: $"+ df.format(price));
        System.out.print("Total Cost is: $"+ df.format(totalcost));
        sc.close();   
    }
}
