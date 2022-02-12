import java.util.Scanner;

public class NFactorielR {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(Process(n));

    }

    public static int Process(int n){

        if(n>1)
            return n* Process(n-1);

        else
            return n;

    }

}
