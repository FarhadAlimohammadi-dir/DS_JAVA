import java.util.Scanner;

public class NFactorielNR {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int result = 1;

        int n = input.nextInt();

        for(int i = n ; i > 0 ; i--)
            result *= i;

        System.out.println(result);

    }


}
