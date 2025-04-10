import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Menu");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Inserir elemento em índice");
            System.out.println("3. Inserir sequência");
            System.out.println("4. Remover primeiro elemento");
            System.out.println("5. Remover elemento por índice");
            System.out.println("6. Remover todas ocorrências");
            System.out.println("7. Buscar elemento");
            System.out.println("8. Buscar elemento por índice");
            System.out.println("9. Ordenar crescente");
            System.out.println("10. Ordenar decrescente");
            System.out.println("11. Quantidade de elementos");
            System.out.println("12. Limpar lista");
            System.out.println("13. Exibir lista");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:

                case 8:

                case 9:

                case 10:

                case 11:

                case 12:

                case 13:

                case 0:
                    System.out.println("Fim...");
                    break;
            }
        } while
            (opcao != 0);
    }
}