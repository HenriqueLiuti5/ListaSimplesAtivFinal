import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaSimples listaSimples = new ListaSimples(5);
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nMenu");
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
            System.out.println("14. Editar elemento");
            System.out.println("15. Obter primeiro elemento");
            System.out.println("16. Obter último elemento");
            System.out.println("17. Dobrar capacidade da lista");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Elemento: ");
                    listaSimples.inserirElemento(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Elemento: ");
                    Object elemento = sc.nextLine();
                    System.out.print("Índice: ");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    listaSimples.inserirElementoIndice(elemento, indice);
                    break;

                case 3:
                    System.out.print("Quantidade de elementos na sequência: ");
                    int qtd = sc.nextInt();
                    sc.nextLine();
                    Object[] sequencia = new Object[qtd];
                    for (int i = 0; i < qtd; i++) {
                        System.out.print("Elemento " + (i + 1) + ": ");
                        sequencia[i] = sc.nextLine();
                    }
                    listaSimples.inserirSequencia(sequencia);
                    break;

                case 4:
                    listaSimples.removerElemento();
                    break;

                case 5:
                    System.out.print("Índice para remover: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    listaSimples.removerIndice(idx);
                    break;

                case 6:
                    System.out.print("Elemento a remover todas ocorrências: ");
                    Object remov = sc.nextLine();
                    listaSimples.removerTodasOcorrencias(remov);
                    break;

                case 7:
                    System.out.print("Elemento para buscar: ");
                    Object buscado = sc.nextLine();
                    boolean encontrado = listaSimples.buscarElemento(buscado);
                    System.out.println("Encontrado: " + encontrado);
                    break;

                case 8:
                    System.out.print("Índice para buscar: ");
                    int idxBusca = sc.nextInt();
                    sc.nextLine();
                    Object retorno = listaSimples.buscarElementoIndice(idxBusca);
                    System.out.println("Elemento encontrado: " + retorno);
                    break;

                case 9:
                    listaSimples.ordenarCrescente();
                    System.out.println("Lista ordenada em ordem crescente.");
                    break;

                case 10:
                    listaSimples.ordenarDecrescente();
                    System.out.println("Lista ordenada em ordem decrescente.");
                    break;

                case 11:
                    System.out.println("Quantidade de elementos: " + listaSimples.quantidadeElementos());
                    break;

                case 12:
                    listaSimples.limpar();
                    System.out.println("Lista limpa.");
                    break;

                case 13:
                    listaSimples.exibir();
                    break;

                case 14:
                    System.out.print("Elemento antigo: ");
                    Object antigo = sc.nextLine();
                    System.out.print("Novo elemento: ");
                    Object novo = sc.nextLine();
                    listaSimples.editarElemento(antigo, novo);
                    break;

                case 15:
                    System.out.println("Primeiro elemento: " + listaSimples.obterPrimeiroElemento());
                    break;

                case 16:
                    System.out.println("Último elemento: " + listaSimples.obterUltimoElemento());
                    break;

                case 17:
                    listaSimples.dobrarCapacidade();
                    System.out.println("Capacidade da lista dobrada.");
                    break;

                case 0:
                    System.out.println("Finalizando...");
                    break;

                default:
                    System.out.println("Opção indisponível.");
            }

        } while (opcao != 0);
    }
}
