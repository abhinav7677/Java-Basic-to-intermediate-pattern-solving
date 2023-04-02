import java.util.*;
public class q16Patternn5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any odd number");
        int n=sc.nextInt();
        int tab=n/2;
        int star=1;

        for(int i=1;i<=n;i++){
            for(int j=1; j<=tab; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=star;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                tab--;
                star=star+2;
            }
            
            else{
                tab++;
                star=star-2;
            }
            System.out.println();
        }
       }
    }
    

