import java.util.ArrayList;
import java.util.Scanner;
class even{
    public ArrayList<Integer> evennum(){
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println("even number in array is");
        for(int i=0;i<20;i++){
            if(i%2==0) {
                a.add(i);
            }
        }
        return a;
    }
}
public class returnArrayList10EvenNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        even obj=new even();
        System.out.println(obj.evennum());
    }
}
