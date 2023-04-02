import java.util.Scanner;
public class q25Pattern14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number");
        int x= sc.nextInt();
        int value=x;
        for(int i=1;i<=10;i++){
            value=x*i;
            System.out.println(x+ "*"+i+"="+value);
            }
    }
    
}
