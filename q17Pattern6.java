import java.util.Scanner;
public class q17Pattern6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        System.out.println(); // TO make code look good after taking input
        int star=n/2+1; //if rows are 5 then star is 3 i.e 5/2 + 1 = 3
        int tab=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){ //Star is printed first 
                System.out.print("*\t");
            }
            for(int j=1;j<=tab;j++){ //After star space is printed
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){ //Again after space star is printed  i.e same code as above
                System.out.print("*\t");
            }

            if(i<=n/2){
                star--;
                tab=tab+2;
            }
            else{
                star++;
                tab=tab-2;
            }
            System.out.println();
        }
    }
}
