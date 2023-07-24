package loops;
import java.util.Scanner;
public class Sum_of_Even_Numbers_till_N {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int res=0;
        while(i<=n){
            if(i%2==0){
                res=res+i;
            }
            i++;
        }
        System.out.println(res);
    }
}
