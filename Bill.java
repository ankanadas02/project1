import java.util.Scanner;
public class Bill{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the unit: ");
        int u= input.nextInt();
        double bill=0;
         if(u<=100){
            bill=u*1.20;
         }
         else if (u>100||u<=300) {
            bill=(100*1.20)+(u-100)*2;
         } else {
            bill=100 * 1.20 + 200 * 2 + (u - 300) * 3;
         }
          

         System.out.println("The electricity bill is:" +bill);
    }
}