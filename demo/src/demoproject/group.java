import java.util.Scanner;

public class  group{

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the roll number: ");
        int rollNumber = input.nextInt();
        
        int groupNumber = (rollNumber - 1) % 4; 
        
        String group;
        switch (groupNumber) {
            case 0:
                group = "Sapphire";
                break;
            case 1:
                group = "Perl";
                break;
            case 2:
                group = "Ruby";
                break;
            case 3:
                group = "Emerald";
                break;
            default:
                group = "Unknown";
        }
        
        System.out.println("The student belongs to the " + group + " group.");
    }
}