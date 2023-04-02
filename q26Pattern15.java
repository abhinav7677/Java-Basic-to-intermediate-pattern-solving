import java.util.Scanner;
public class q26Pattern15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tab=n/2;
        int star=1;
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=tab;j++) {

                System.out.print("\t");
            }

            int cval=val; //for column

            for(int j=1;j<=star;j++) {
                System.out.print(cval+"\t");
                
                if(j<=star/2)
                {
                    cval++;

                }
                else{
                    cval--;
                }
            }
                

                if(i<=n/2){
                    tab--;
                    star=star+2;
                    val++;
                }
                else{
                    tab++;
                    star=star-2;
                    val--;
                }

                System.out.println();
            }
        }
    }
    

