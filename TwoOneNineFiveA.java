import java.util.Scanner;

public class TwoOneNineFiveA {
    public static void main(String[] args) {
Scanner Myobj = new Scanner(System.in);
int n = Myobj.nextInt();
for(int j = 0; j<n;j++){
int l = Myobj.nextInt();
int ch = 0;
int[] a = new int[l];
for (int i = 0; i < l; i++) {
    a[i] = Myobj.nextInt();
    
}
for (int i = 0; i < l; i++) {
        
            if(a[i] == 67){
                ch++;
            }
            else{}
            
        
}
if(ch>0){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}


}
}    

