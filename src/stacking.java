class stack{
    int top;
    int[] array;
    public stack(int s){
        top=top-1;
        array=new int[s];
    }
    public void push(int num){
        if(top==array.length-1){
            System.out.println("stack is full");
        }
        top=top+1;
        array[top]=num;
    }
    public int pop(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        return array[top--];
    }
    public void traversing(){
        while(top>-1){
            int value=pop();
            System.out.println(value);
        }
    }
}
public class stacking {
    public static void main(String[] args) {
        stack p=new stack(10);
        p.push(8);
        p.push(6);
        p.push(5);
        p.pop();
        p.traversing();

    }
}
