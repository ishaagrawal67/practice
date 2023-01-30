import java.util.Scanner;

class first{
    public int sum(int n){
        int s=0;
        for(int i=0;i<=n;i++){
            s=s+i;
        }
        return s;
    }
    public int sum(int a,int b){
        int s=a+b;
    return s;
    }
}
public class overloading {
    public static void main(String[] args) {
        first f=new first();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first");
        int s=sc.nextInt();
        System.out.println(f.sum(s));
        System.out.println("enter second");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(f.sum(a,b));
}
    }
