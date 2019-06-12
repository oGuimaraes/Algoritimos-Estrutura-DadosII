package sortingStructures;

import java.util.Random;

public class Ordenacao {

    public void insertionSort(int[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++) {
            int atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] >= atual) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
            ;
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de InsertionSort: " + tempototal + "ms");

    }

    public void selectionSort(int[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int tmp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = tmp;
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de SelectionSort: " + tempototal + "ms");

    }

    public void bubbleSort(int[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        for (int i = vetor.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (vetor[j - 1] > vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de BubbleSort: " + tempototal + "ms");

    }

    public void BBSortAdap1(int[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        boolean houveTroca = true;
        int temp;
        while (houveTroca) {
            houveTroca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    houveTroca = true;
                }
            }
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de BubbleSortAdap1: " + tempototal + "ms");
    }

    public void BBSortAdap2(int[] vetor)
    {
        long tempoinicial = System.currentTimeMillis();

        int temp, cont = vetor.length - 1;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < cont; j++)
                if (vetor[j] > vetor[j + 1]) {
                    temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            cont--;

        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de BubbleSort: " + tempototal + "ms");
    }

    public void BBSortHybrid(int[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        int temp, cont = vetor.length - 1;
        boolean houveTroca = true;
        while (houveTroca) {
            houveTroca = false;
            for (int j = 0; j < cont; j++)
                if (vetor[j] > vetor[j + 1]) {
                    temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    houveTroca = true;
                }
            cont--;
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de BubbleSort: " + tempototal + "ms");

    }


    public void shellSort(int[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        int h = 1;
        int n = vetor.length;
        while (h < n) {
            h = h * 3 + 1;
        }
        h = h / 3;
        int c, j;
        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = vetor[i];
                j = i;
                while (j >= h && vetor[j - h] > c) {
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = c;
            }
            h = h / 2;
        }
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de ShellSort: " + tempototal + "ms");
    }

    public void mergeSort(int[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        vetor = MergeSort.sort(vetor);
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de MergeSort: " + tempototal + "ms");
    }

    public void quickSort(int[] vetor) {
        long tempoinicial = System.currentTimeMillis();
        QuickSort.sort(vetor);
        long tempofinal = System.currentTimeMillis();
        long tempototal = tempofinal - tempoinicial;
        System.out.println("Tempo de Processamento de QuickSort: " + tempototal + "ms");

    }

    public int[] gerarNumeros() {
        Random random = new Random();
        int[] sorteio = new int[100000];
        for (int i = 0; i < sorteio.length -1; i++) {
            boolean novoNumero = false;
            int numero = -1;
            while (!novoNumero) {
                numero = random.nextInt(500001);
                novoNumero = verificarExistencia(numero, sorteio);
            }
            sorteio[i] = numero;
        }
        return sorteio;
    }

    private boolean verificarExistencia(int numero, int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            if (numero == lista[i]) {
                return false;
            }
        }
        return true;
    }

    public void imprimirVetor(int[] vetor) {
        for (int counter = 0; counter < (vetor.length - 1); counter++) {
            System.out.print(vetor[counter] + " ");
        }
        System.out.println(" ");
    }


}
