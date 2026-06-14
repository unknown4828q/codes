import java.util.Scanner;
public class TwotwotwoeightA {
    public static void main(String[] args) {
Scanner Myobj = new Scanner(System.in);
int n = Myobj.nextInt();
for(int j = 0; j<n;j++){
int l = Myobj.nextInt();
int o = 0;
int[] a = new int[l];
for (int i = 0; i < l; i++) {
    a[i] = Myobj.nextInt();
    
}
for(int k = 0; k<=n-1;k++){
    if(a[k]==0){
        o++;
    }
    else if(a[k]+a[k+1] == 3){
        o++;
    }
}
System.err.println(o);

}
}    


}
