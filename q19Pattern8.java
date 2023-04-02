import java.util.*;
public class q19Pattern8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows you a want a diagonal for");
        int n=sc.nextInt();
        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n;j++){
                if(i+j==n+1){ //sum of current row and column of star=entered number+1 where the star will be printed
                System.out.print("*\t");    
                }else{
                System.out.print("\t");
                }
                
            }
            System.out.println();
        }
    }
}
/*import java.util.*;
public class q19Pattern8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(i==j){
                    System.out.print("*\t");
                }                                           //Not an optimized code! Can be used for complex pattern with this method
                else{
                    System.out.print("\t");
                }


            } 
            System.out.println();
        }
        
    }

}*/
