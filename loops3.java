public class loops3 {
    static void main() {
        int n = 4;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if((i+j == 1)||(i+j == 3)||(i+j==5)){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        //q2


        // int g = 6;
        // for(int k = 0; k<g; k++){
        //     for(int l = 0; l<k; l++){
               
        //      if(k%2==0){
                    
        //             System.out.print(" ");
                    
        //         }
                
            
        //     else{
        //         System.out.print(" *");
        //     }

        //     }
        //     System.out.println(" ");
            
        // }
        //q3



        //int star = 1, space = 2, flag = 1;
        // for(int i=0;i<5;i++){
            
        //     for(int j=0;j<space;j++)     System.out.print("* ");
        //     for(int j=0;j<star;j++)    System.out.print("  ");
        //     for(int j=0;j<space;j++)     System.out.print("* ");
        //     if(i == 2)  flag = 0;
        //     if(flag == 1){
        //         star += 2;
        //         space--;
        //     }
        //     else{
        //         star -= 2;
        //         space++;
        //     }
        //     System.out.println();
        // }

        //q4


        //  for(int i=0;i<5;i++){
            
        //     for(int j=0;j<space;j++)    System.out.print("  ");
        //     for(int j=0;j<star;j++){
        //         if(j==0 || j == star -1) {    
        //         System.out.print("* ");
        //         }
        //     else System.out.print("  ");
        //     }
            
        //     if(i == 2)  flag = 0;
        //     if(flag == 1){
        //         star += 2;
        //         space--;
        //     }
        //     else{
        //         star -= 2;
        //         space++;
        //     }
        //     System.out.println();
        // }

        //q5


    
    //   int star = 1, space = 3;
    //     for(int i=0;i<4;i++){
            
    //         for(int j=0;j<space;j++)    System.out.print("  ");
    //         for(int k=star;k>0;k--)     System.out.print(k+" ");
            
            
    //             for(int l=2;l<=i+1;l++)   System.out.print(l+" ");
                         
    //             star += 1;
    //             space--;
            
            
    //         System.out.println();
    //     }
            
//q6




    // for(int i=0;i<4;i++){
    //     for(int k = 0; k<i; k++)  System.out.print(" ");
    //     for(int j = 0; j<4; j++)  System.out.print("*");
    
            
    //     System.out.println(" ");
    // }

    //q7



    // int star = 1, space = 3, flag = 1;
    //     for(int i=0;i<5;i++){
            
    //        for(int j=0;j<space;j++){
            
    //             System.out.print("* ");
                 
    //         }
    //         for(int j=0;j<star;j++)    System.out.print("  ");
            
    //         if(i == 2)  flag = 0;
    //         if(flag == 1){
    //             star += 2;
    //             space--;
    //         }
    //         else{
    //             star -= 2;
    //             space++;
    //         }
    //         System.out.println();
    //     }
    }
    }

