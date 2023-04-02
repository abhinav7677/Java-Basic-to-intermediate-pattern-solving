import java.util.*;
public class q20Pattern9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows/cols");
        int n=sc.nextInt();
        System.out.println();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

                if(i==j || i+j==n+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }

    
}
