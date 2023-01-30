
public class numberofvowelsinstring {
    public static int first(String s){
        System.out.println("ti");
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(first("isha"));
    }
}
