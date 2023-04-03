import java.util.*;
public class q27Pattern16 {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println();
       int star=1;
       int tab=2*n-3;
        for(int i=1; i<=n;i++){
            int val=1; // writing val=1 inside for loop because in every starting of the row the value is reset back to 1
            for(int j=1;j<=star;j++)
                {
                System.out.print(val+"\t");
                val++;
                }
            for(int j=1;j<=tab;j++)
                {
                System.out.print("\t");
                }
                if(i==n){
                    star--;
                    val--;//done at last to fix the pattern
                }
            for(int j=1;j<=star;j++)
                {
                    val--;
                System.out.print(val+"\t");
                //val--; // we val-- before system print or else a column number is increased by a digit(uncomment and see for better understaing) 
                }
        tab=tab-2;
        star++;
            System.out.println();

        }
        
        }
    
}
