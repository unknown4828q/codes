public class Two {
    static public void  main(String[] arg){
        int space =3, star = 1;
        int n = 4;
        for(int i =0; i<n;i++){
            for(int j = 0; j<space;j++) System.out.print(" ");
            for(int j = 0; j<star;j++) System.out.print(j+1);
            space--;
            star+=2;
            System.out.println(" ");
        }
    }
}
