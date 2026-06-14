import java.util.Scanner;

public class loops {
public static void main(String[] args) {
     Scanner Myobj = new Scanner(System.in);
    int x = Myobj.nextInt();
    int y = Myobj.nextInt();
    int i = 1;
    while (y >0){
        y--;
        i = i*x;
    
    }
    System.out.println(i);
    //q0

    int j = 1;
    while (j<= 50){
           System.out.println(j);
            j+=2;
        }
        //q1


    int a = Myobj.nextInt();
     int b = Myobj.nextInt();
     char c = Myobj.next().charAt(0);
     if(c  == '+'){
            System.out.println(a+ b);
     }
     else if(c == '-'){
            System.out.println(a- b);
     }

     else if(c == '*'){
            System.out.println(a*b);
     }
     else if(c == '/'){
        if(b== 0){
            System.out.println("Undefined");
        }
        else{
            System.out.println(a/ b);
        }
     }
     else if(c == '%'){
        if(b== 0){
            System.out.println("Undefined");
        }
        else{

            System.out.println(a+ b);
        }
     }
     //q2


    int num = Myobj.nextInt();
    int count = 0;    
    int reversed = 0;
    
     while ( num != 0){
        
        System.out.print(num%10+" ");
      
         int digit = num % 10;
         reversed = reversed*10 + digit;
         num /=10;
         count++;
         }
 
        
         while (reversed != 0){                                 //count(!=0){count--;}
            System.out.print(reversed%10+" ");
            reversed /= 10;
            count--;
         }
         while (count !=0){
            System.err.print(0+" ");
            count--;
         }
          System.out.println(reversed);
    
            ////#####  DO - while loop
    // q3
    int sev =0;
    int cp = 0;
    do{
        int l= Myobj.nextInt();
        sev = sev + l;
        System.out.println(sev);
        cp = l;

    }while(cp!=0);

    //q4

   
    int digitl = 0;
    do{
        int l= Myobj.nextInt();
        cp = l;
         while ( l != 0){
              digitl = l % 10;
               sev = sev + digitl;
               l/=10;
         }
        
        System.out.println(sev);

    }while(cp!=0);

    // q5
    int g = Myobj.nextInt();
    boolean cv  = true;
    if(g == 2){
        System.out.println("Prime");
    }
    for(int m =2; m*m<g; m++){     //m<g/2(square root is more faster)
         if ( g%m ==0){
            cv = false;
            break;
        }
        else{
           cv = true;
        }
        }
        if (cv == true){
            System.out.println("Given number is prime");
        }
        else{
            System.out.println("Given number is non prime");
        }

        Myobj.close();
}
}
