import java.util.Scanner;


public class TwoOneFourNineA {
public static void main(String[] args) {
Scanner Myobj = new Scanner(System.in);
int n = Myobj.nextInt();
for(int j = 0; j<n;j++){
int l = Myobj.nextInt();
int op = 0;
int neg = 0;
int[] a = new int[l];
for (int i = 0; i < l; i++) {
    a[i] = Myobj.nextInt();

}
for (int i = 0; i < l; i++) {
    if(a[i]<0){
        
        neg++;
        
    }
 if(a[i]==0){
        a[i]+=1;
        op++;
    }
    
}
if(neg%2!=0){
        op+=2;
    }
System.out.println(op);
Myobj.close();


}
}    
}


