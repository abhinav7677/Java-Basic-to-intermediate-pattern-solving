import java.util.*;
public class q15Pattern3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter your number for pattern");
        int n=sc.nextInt();
        int tab=n-1;
        int star=1;
        for(int i=1;i<=n;i++){
            //for tab because space is printed first
            for(int j=1; j<=tab; j++){
                System.out.print("\t");
            }
            //for star because star is printed later
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            System.out.println();
            tab--;
            star++;
        }

    }
    
}
