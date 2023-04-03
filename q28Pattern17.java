import java.util.Scanner;
public class q28Pattern17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
        int tab=2;
        int star=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=tab;j++){
                if(i==n/2+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
                
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }

            System.out.println();
            if(i<=n/2){
                star++;
            }
            else{
                star--;
            }
            System.out.println();
        }
    }
    
}
