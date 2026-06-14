import java.util.*;
public class contestone{


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x % 2 == 1 && y % 2 == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    sc.close();
}


}


