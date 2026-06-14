import java.util.*;
public class Methods {
public static boolean  isprime (int n) {
       
    boolean cv  = true;
    if(n == 2){
        cv = true;
    }
    for(int m =2; m<n; m++){    
         if ( n%m ==0){
            cv = false;
            break;
        }
        else{
           cv = true;
        }
        }
        return cv;
};
public static int findGCD(int a, int b) {
    if (b == 0) 
        return a;
    return findGCD(b, a % b);
}
public static boolean  tenth(int n) {
    boolean cvs = true;
    int count = 0;
    int digitos = 0;
    while(n!=0){
        int digito = n%10;
        count++;
        n/=10;
        if(count == 2){
            digitos = digito; 
            break;
        }
    }
    if(digitos==0){
        cvs = true;
    }
    else {
        cvs = false;
    }
    return cvs;
}

public static void main(String[] arg){
    Scanner Myobj = new Scanner(System.in);
    int var = Myobj.nextInt();
    int var1  = Myobj.nextInt();
System.out.println("GCD = "+findGCD(var, var1));
   for (int i = 2; i <=var; i++) {
   if(isprime(i)==true){ 
       System.out.println(i);   
    }
   
        }
if(tenth(var) == true){
    System.out.println("Yes");
}
else{
    System.out.println("No");
}
Myobj.close();
    }
}
