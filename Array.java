
public class Array {
    public static void main(String[] args) {
        int[] arr = {1,2,5,10};
        //enhance for loop
        
       
        for(int a : arr){
            System.out.println(a);
        }
        int s = 0;
        for(int a : arr){
            s +=a;
          
        }
        System.out.println(s);
    }
     
}
