public class Four {
    public static void main(String[] arg){
        int n = 4;
        for(int i=0; i<n;i++){
            for(int j = n; j>i; j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    
}
