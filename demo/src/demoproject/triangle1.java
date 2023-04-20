import java.util.Scanner;

public class triangle1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the angles");
        int[] angles = new int[3];
        for (int i = 0; i < 3; i++) {

            angles[i] = scanner.nextInt();
        }
        scanner.close();

       
        if (angles[0] + angles[1] + angles[2] != 180) {
            System.out.println("No Prize");
        } else if (angles[0] == angles[1] && angles[1] == angles[2]) {
            System.out.println("Prize 3");
        } else if (angles[0] == 90 || angles[1] == 90 || angles[2] == 90) {
            if (angles[0] == angles[1] && angles[1] == angles[2]) {
                System.out.println("Prize 3");
            } else {
                System.out.println("Prize 2");
            }
        } else {
            System.out.println("Prize 1");
        }
    }
}