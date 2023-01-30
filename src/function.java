import java.util.ArrayList;
import java.util.Stack;

class func{
    public void print(){// this function does not return anything
        System.out.println("this");
    }
    public int first(){
        return 5;//function return something thats why we use int/boolean/flost any datatype in place of void
    }
    public ArrayList<Integer> second(){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(4);
        //a.remove(0);
        return a;
    }
    public Stack<Integer> third(){
        Stack<Integer> s=new Stack<>();
        s.add(2);
        s.add(3);
        s.add(5);
        s.pop();
        return s;
    }

}
public class function {
    public static void main(String[] args) {
        func obj=new func();
        obj.print();//void function never write in sout method
        System.out.println(obj.second());
        System.out.println(obj.third());
    }

}
