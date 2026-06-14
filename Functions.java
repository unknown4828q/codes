public class Functions {
     static int sum(int a , int b){
        return a+b;
    }
    static int fact(int n){
        if(n<=1) {
            return 1;
        }
        return n*fact(n-1);
    } 

    
    public static void main(String[] args) {
        int s = sum(10,15);
        System.out.println(s);
        System.out.println(fact(3));
    }
}
