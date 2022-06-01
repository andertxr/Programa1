package My.first.program;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        char opcao ='s';
        Scanner teclado = new Scanner(System.in);
        while (opcao == 's') {
            System.out.println("Lançamento do Dado ......");
            int dado = (int) (Math.random() * 6 + 1);
            System.out.println("Face:" + dado);
            System.out.println("Lancar novamesnte (s/n) ? ");
            opcao=teclado.next () .charAt(0);

        }




    }
}
