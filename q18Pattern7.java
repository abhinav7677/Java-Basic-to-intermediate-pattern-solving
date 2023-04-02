import java.util.Scanner;
public class q18Pattern7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows you a want a diagonal for");
        int n=sc.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++){
           
            for(int j=1;j<=n;j++){
              if(i==j){ //star is only printed when rows and cols are same i.e diagonal
                System.out.print("*\t");
              }
              else{
                System.out.print("\t"); // at rest od the space tab is printed
              }
              
            }
            System.out.println();
        }
    }
    
}
