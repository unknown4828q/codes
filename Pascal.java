public class Pascal {
    public static long nCr(int n, int r) {
    if (r > n) return 0;
    return factorial(n) / (factorial(r) * factorial(n - r));
}

static long factorial(int n) {
    long fact = 1;
    for (int i = 2; i <= n; i++) fact *= i;
    return fact;
}


public static void main(String[] args) {
   int n = 5;
   int space =4;
   int star = 1;
   for(int i = 0; i <n; i++){
    for(int j = 0; j < space; j ++) System.out.print(" ");
    for(int j = 0; j < star; j++) System.out.print(nCr(i,j)+" ");
    space--;
    star+=2;
    System.out.println();
   }    
}
    
}

