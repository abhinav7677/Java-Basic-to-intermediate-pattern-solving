import java.util.*;
public class q15Pattern4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number your want for star formation");
        int n=sc.nextInt();

        int tab=0;
        int star=n;

        for(int i=n;i>=1;i--){
            for(int j=1;j<=tab;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }

            System.out.println();
            tab++;
            star--;
        }
    }
    
}
