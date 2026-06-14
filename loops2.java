import java.util.Scanner;
public class loops2 {
public static void main(String[] args) {
     Scanner Myobj = new Scanner(System.in);
     int n = 8652964;
     
     while(n!=0){
         int digit = n%10;
         int count = 0;
         for(int i=2;i<digit;i++){
             
         if(digit%i == 0){
            count ++;
         }
         }
         if(count==0)
         System.out.println(digit);
         n=n/10;
     }

     int  m = 1000;
    int  z = 2;
     
     
     for(int i=z; i<m;i++ ){
     int s = 0;
     int a = i;
     while(a!=0){
         int digit = a%10;
         s =  s+digit;
         a/=10;
     }
     if(i/s == 0){
         System.out.println(i);
     }
     }
    int x = 5220;
    int cot = 0;
    if(x == 0){
        cot = 1;
    }     
    else{
        cot = (int)Math.log10(x);

    }
    System.out.println(cot);
    int l = 12345;
    int nums = (int)Math.log10(l) +1;
    int k = Myobj.nextInt();
    
    int h = k % nums;
    int digit = 0;
    int ln =0;
switch (h) {
    case 0:
        System.out.println(l);
        break;
    case 1:
        digit = l % (int)Math.pow(10, h);
        ln = (l /(int)Math.pow(10, h)) + (digit * (int)Math.pow(10, nums-h));
        System.out.println(ln);
        break; 
    case 2:
        digit = l % (int)Math.pow(10, h);
        ln = (l /(int)Math.pow(10, h)) + (digit * (int)Math.pow(10, nums-h));
        System.out.println(ln);
        break;
    case 3:
        digit = l % (int)Math.pow(10, h);
        ln = (l /(int)Math.pow(10, h)) + (digit * (int)Math.pow(10, nums-h));
        System.out.println(ln);
        break;
    case 4:
        digit = l % (int)Math.pow(10, h);
        ln = (l /(int)Math.pow(10, h)) + (digit * (int)Math.pow(10, nums-h));
        System.out.println(ln);
        break;
    case 5:
        digit = l % (int)Math.pow(10, h);
        ln = (l /(int)Math.pow(10, h)) + (digit * (int)Math.pow(10, nums-h));
        System.out.println(ln);
        break; 
    default: 
        System.out.println("");
        Myobj.close();
}

}
}
