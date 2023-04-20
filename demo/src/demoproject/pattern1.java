import java.util.*;
class pattern1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the term: ");
        int h=in.nextInt();
        int i,j,k;
        for(i=1;i<=h;i++)
        {
            for(j=1;j<=i;j++)
            
                System.out.print(j);
            
            for(k=i-1;k>=1;k--)
            
            System.out.print(k);
            
            System.out.println();
        }
    }
}