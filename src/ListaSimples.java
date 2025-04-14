import java.util.Arrays;

public class ListaSimples implements IEstruturaSimples {
    private Object[] elementos;
    private int tamanho;

    public ListaSimples(int capacidadeInicial) {
        this.elementos = new Object[capacidadeInicial];
        this.tamanho = 0;
    }

    @Override
    public void inserirElemento(Object elemento) {
        if (estaCheia()) {
            dobrarCapacidade();
        }
        elementos[tamanho++] = elemento;
    }

    @Override
    public void inserirElementoIndice(Object elemento, int indice) {
        if (indice < 0 || indice > tamanho) {
            System.out.println("Índice inválido!");
            return;
        }
        if (estaCheia()) {
            dobrarCapacidade();
        }
        for (int i = tamanho; i > indice; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[indice] = elemento;
        tamanho++;
    }

    @Override
    public void inserirSequencia(Object elementos) {
        Object[] sequencia = (Object[]) elementos;
        for (Object elemento : sequencia) {
            inserirElemento(elemento);
        }
    }

    @Override
    public boolean removerElemento() {
        if (estaVazia()) return false;
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--tamanho] = null;
        return true;
    }

    @Override
    public Object removerIndice(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Índice inválido!");
            return null;
        }
        Object removido = elementos[indice];
        for (int i = indice; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[--tamanho] = null;
        return removido;
    }

    @Override
    public void removerSequencia(Object elementos) {
        Object[] sequencia = (Object[]) elementos;
        for (Object elem : sequencia) {
            removerTodasOcorrencias(elem);
        }
    }

    @Override
    public void removerTodasOcorrencias(Object elemento) {
        int i = 0;
        while (i < tamanho) {
            if (elementos[i].equals(elemento)) {
                removerIndice(i);
            } else {
                i++;
            }
        }
    }

    @Override
    public boolean estaCheia() {
        return tamanho == elementos.length;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public boolean buscarElemento(Object elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object buscarElementoIndice(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Índice inválido!");
            return null;
        }
        return elementos[indice];
    }

    @Override
    public void ordenarCrescente() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                Comparable atual = (Comparable) elementos[j];
                Comparable proximo = (Comparable) elementos[j + 1];
                if (atual.compareTo(proximo) > 0) {
                    Object temp = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void ordenarDecrescente() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                Comparable atual = (Comparable) elementos[j];
                Comparable proximo = (Comparable) elementos[j + 1];
                if (atual.compareTo(proximo) < 0) {
                    Object temp = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public int quantidadeElementos() {
        return tamanho;
    }

    @Override
    public void dobrarCapacidade() {
        elementos = Arrays.copyOf(elementos, elementos.length * 2);
    }

    @Override
    public void editarElemento(Object elementoAntigo, Object elementoNovo) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elementoAntigo)) {
                elementos[i] = elementoNovo;
            }
        }
    }

    @Override
    public void limpar() {
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = null;
        }
        tamanho = 0;
    }

    @Override
    public void exibir() {
        System.out.print("Lista: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i]);
            if (i < tamanho - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    @Override
    public Object obterPrimeiroElemento() {
        if (estaVazia()) return null;
        return elementos[0];
    }

    @Override
    public Object obterUltimoElemento() {
        if (estaVazia()) return null;
        return elementos[tamanho - 1];
    }
}
