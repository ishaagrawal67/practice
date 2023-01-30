import java.util.Scanner;

class array {
    public void min(int array[],int m,int n){

       for(int i=0;i<array.length;i++){
           if(m<array[i]){
               m=array[i];
           }
       }
        for(int i=0;i<array.length;i++){
            if(n>array[i]){
                n=array[i];
            }
        }
        System.out.println(m);
        System.out.println(n);
    }
}

    public class printminmaxvalueinanarray {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int max=0;
            int array[]=new int[n];
            for (int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            int min=array[0];
            array obj=new array();
            obj.min(array,max,min);
        }
    }
