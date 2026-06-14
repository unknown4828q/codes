 public class Sixteen{
    public static void main(String[] args) {
    int star = 1, space = 3, flag = 1;
        for(int i=0;i<5;i++){
            
           for(int j=0;j<space;j++){
            
                System.out.print("* ");
                 
            }
            for(int j=0;j<star;j++)    System.out.print("  ");
            
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
