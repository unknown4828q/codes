public class Twenty_two{
    public static void main(String[] arg){
        int star = 1, space = 2, flag = 1;
      for(int i=0;i<5;i++){
            
            for(int j=0;j<space;j++)    System.out.print("  ");
            for(int j=0;j<star;j++){
                if(j==0 || j == star -1) {    
                System.out.print("* ");
                }
            else System.out.print("  ");
            }
            
            if(i == 2)  flag = 0;
            if(flag == 1){
                star += 2;
                space--;
            }
            else{
                star -= 2;
                space++;
            }
            System.out.println();
        }

    }
}