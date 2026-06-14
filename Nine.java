public class Nine{
    public static void main(String[] arg){
        int star = 1, space = 3;
        for(int i=0;i<4;i++){
            
            for(int j=0;j<space;j++)    System.out.print("  ");
            for(int k=star;k>0;k--)     System.out.print(k+" ");
            
            
                for(int l=2;l<=i+1;l++)   System.out.print(l+" ");
                         
                star += 1;
                space--;
            
            
            System.out.println();
        }
    }
}