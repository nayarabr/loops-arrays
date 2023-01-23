package loops;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial +"! = ");
        for(int i = fatorial ; i >= 1 ; i --) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);

//        System.out.println("Recursivo = " + calcFatorial(fatorial));
    }

/*    public static int calcFatorial(int n) {
        if (n == 1){
          return 1;
        }
        if (n == 2) {
          return 2;
        }
        return n * calcFatorial(n - 1);
    }*/

}
