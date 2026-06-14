import java.util.*;
public class no {
    
        public static void main(String[] arg) {
        Scanner Myobj = new Scanner(System.in);
        int n = Myobj.nextInt();
        boolean flag = false;
        for(int i =1; i<=n;i++){
        int j = 0;    
        
            int temp = i;
            while(temp!=0){
                int digit = temp%10;
                
                if(digit == 0|| digit == 1||digit == 2||digit == 5||digit == 8||digit == 9||digit == 6){  
                    flag = true;
                        }
                        
                        temp/=10;

        }
        if(flag == true){
            j++;
        }
    }
        System.out.println(j);
    }
   
}

