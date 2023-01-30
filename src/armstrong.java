import java.util.Scanner;
class arm{
    public boolean arms(int n){
        int x=n;
        int r=0;
        int s=0;
        while(x>0){
           r=x%10;
           s+=Math.pow(r,3);
           x=x/10;
        }
        return s==n;
    }
}
public class armstrong {
    public static void main(String[] args) {
        arm n= new arm();
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        if(n.arms(p)) {
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}
