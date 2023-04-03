import java.util.*;
public class q29Pattern18 {
    public static void main(String[] args){
        
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int star=n;
            int tab=0;

            for(int i=1;i<=n;i++){
                for(int j=1;j<=tab;j++){
                    System.out.print("\t");
                }
            for(int j=1;j<=star;j++){
                if(i> 1&& i<=n/2 && j>1&&j<star){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
                
            }
            System.out.println();
            if(i<=n/2){
                tab++;
                star=star-2;
            }
            else{
                tab--;
                star=star+2;
            }
            
            }
        
    }
    
}
