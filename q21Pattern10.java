import java.util.*;
public class q21Pattern10 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int outerspace=n/2;
    int innerspace= -1;

    for(int i=1;i<=n;i++){
        for(int j=1;j<=outerspace;j++){
            System.out.print("\t");       
        }

        System.out.print("*\t");

        for(int j=1;j<=innerspace;j++){
            System.out.print("\t");
        }
        if(i<=n/2){
            outerspace--;
            innerspace=innerspace+2;
        }
        else{
            outerspace++;
            innerspace=innerspace-2;
        }

        if(i>1&&i<n){
            System.out.print("*\t");
        }
      System.out.println();    
    }
    }
    
}
