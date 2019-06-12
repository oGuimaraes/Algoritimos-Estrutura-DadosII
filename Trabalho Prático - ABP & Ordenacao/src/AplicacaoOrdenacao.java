import sortingStructures.*;

public class AplicacaoOrdenacao {

    public static void main(String[] args) {
        //Instanciando a classe com os metodos de ordenaçao
        Ordenacao ordenar = new Ordenacao();

        //Construindo o vetorA de 1 a 100000
        int[] vetorA = new int[100000];
        for (int i = 0; i < vetorA.length - 1; i++) {
            vetorA[i] = i + 1;
        }
        //Construindo o vetorB de 100000 a 1
        int[] vetorB = new int[100000];
        int k = vetorB.length;
        for (int i = 0; i < vetorB.length -1; i++) {
            vetorB[i] = k;
            k--;
        }
        //Construindo o vetorC com numeros aleatorios (nao repetidos de 0 a 99999)
        int[] vetorC = ordenar.gerarNumeros();

        //Chamada dos metodos para ordenaçao dos vetores

        ordenar.insertionSort(vetorA);
        ordenar.insertionSort(vetorB);
        ordenar.insertionSort(vetorC);

        ordenar.selectionSort(vetorA);
        ordenar.selectionSort(vetorB);
        ordenar.selectionSort(vetorC);

        ordenar.quickSort(vetorA);
        ordenar.quickSort(vetorB);
        ordenar.quickSort(vetorC);

        ordenar.mergeSort(vetorA);
        ordenar.mergeSort(vetorB);
        ordenar.mergeSort(vetorC);

        ordenar.shellSort(vetorA);
        ordenar.shellSort(vetorB);
        ordenar.shellSort(vetorC);

        ordenar.bubbleSort(vetorA);
        ordenar.bubbleSort(vetorB);
        ordenar.bubbleSort(vetorC);

        ordenar.BBSortAdap1(vetorA);
        ordenar.BBSortAdap1(vetorB);
        ordenar.BBSortAdap1(vetorC);

        ordenar.BBSortAdap2(vetorA);
        ordenar.BBSortAdap2(vetorB);
        ordenar.BBSortAdap2(vetorC);

        ordenar.BBSortHybrid(vetorA);
        ordenar.BBSortHybrid(vetorB);
        ordenar.BBSortHybrid(vetorC);

    }

}