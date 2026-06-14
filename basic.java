import java.util.*;

class basic {
public static void main(String[] args){

    //conditional
    int s = 11;
    if(s %2==0)
        System.out.println("even");
    else
        System.out.println("odd");
double x = 11.5;
if(x-(int)x == 0){
    System.out.println("Integer");
    System.out.println("not integer");
}
    if(x==0);
    //type conversion
    char e = 'A';
    int g = (int) e;
    System.out.println(g);
    //input
    Scanner Sc = new Scanner(System.in);
    int d = Sc.nextInt();
    String f = Sc.nextLine();
    System.out.println(d);
    System.out.println(f);
    System.out.println("hello");
    int a = 188;
    //operators
    System.out.println( (a>= 100 && a<=200) || (a>=250 && a<=300) || (a!=188) );

    int b = 8;
    System.out.println(b == 5 && b!=6);
    System.out.println(b);
    int c = 100;
    System.out.println((c < 10)?7:8);
    Sc.close();
    }
}
