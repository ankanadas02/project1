import java.util.Scanner;

public class passenger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in aircraft: ");
        int n = input.nextInt();
       
 int total_passenger=0;
       for(int i=1;i<=n;i++){
        System.out.print("Enter the number of people in row : ");
        int y = input.nextInt();
         total_passenger+=y;
       }
       System.out.println("Total number of passenger in aircraft will be:"+total_passenger);
    }
}