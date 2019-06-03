import treeStructures.CArvAVL;
import treeStructures.CArvBin;
import treeStructures.CNo;
import treeStructures.NoAVL;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aplicacao {

    public static void main(String[] args) {

        consultaCrescente(calculaTempoInsercaoCrescente());
        consultaDecrescente(calculaTempoInsercaoDecrescente());
        calculaTempoInsercaoAleatorio();

    }

    private static List<Object> calculaTempoInsercaoCrescente(){

        /* Declaraçao das variaveis TEMPO */
        long tempInicial;
        long tempFinal;
        long tempCalculadoABP = 0;
        long tempCalculadoAVL = 0;

        /* Criação das arvores ABP & AVL */
        CArvBin abpCrescente = new CArvBin();
        CArvAVL avlCrescente = new CArvAVL();
        int nElementos = 12000;
        System.out.println("--------------------------------------------");
        System.out.println("Inserção Ordem-Crescente (NºElementos:" + nElementos + "): ");

        /* Inserção dos valores e calculando tempo na árvore ABP */
        tempInicial = System.currentTimeMillis();
        for (int i = 1; i <= nElementos; i++) {
            abpCrescente.inserir(i);
        }
        tempFinal = System.currentTimeMillis();
        tempCalculadoABP = (tempFinal - tempInicial);
        System.out.println("- ABP: " + tempCalculadoABP + "ms");


        /* Inserção dos valores e calculando tempo na árvore AVL */
        tempInicial = System.currentTimeMillis();
        for (int i = 1; i <= nElementos; i++) {
            avlCrescente.inserir(i);
        }
        tempFinal = System.currentTimeMillis();
        tempCalculadoAVL = (tempFinal - tempInicial);
        System.out.println("- AVL: " + tempCalculadoAVL + "ms");

        ArrayList treeList = new ArrayList();
        treeList.add(0, abpCrescente);
        treeList.add(1, avlCrescente);

        return treeList;
    }

    private static List<Object> calculaTempoInsercaoDecrescente(){

        /* Declaraçao das variaveis TEMPO */
        long tempInicial;
        long tempFinal;
        long tempCalculadoABP = 0;
        long tempCalculadoAVL = 0;

        /* Criação das arvores ABP & AVL */
        CArvBin abpDecrescente = new CArvBin();
        CArvAVL avlDecrescente = new CArvAVL();
        int nElementos = 12000;

        System.out.println("\n" + "Inserção Ordem-Decrescente (NºElementos:" + nElementos + "):");

        /* Inserção dos valores e calculando tempo na árvore ABP */
        tempInicial = System.currentTimeMillis();
        for (int i = nElementos; i >= 1; i--) {
            abpDecrescente.inserir(i);
        }
        tempFinal = System.currentTimeMillis();
        tempCalculadoABP = (tempFinal - tempInicial);
        System.out.println("- ABP: " + tempCalculadoABP + "ms");


        /* Inserção dos valores e calculando tempo na árvore AVL */
        tempInicial = System.currentTimeMillis();
        for (int i = nElementos; i >= 1; i--) {
            avlDecrescente.inserir(i);
        }
        tempFinal = System.currentTimeMillis();
        tempCalculadoAVL = (tempFinal - tempInicial);
        System.out.println("- AVL: " + tempCalculadoAVL + "ms");

        ArrayList treeList = new ArrayList();
        treeList.add(0, abpDecrescente);
        treeList.add(1, avlDecrescente);

        return treeList;
    }

    private static List<Object> calculaTempoInsercaoAleatorio(){

        /* Declaraçao das variaveis TEMPO */
        long tempInicial;
        long tempFinal;
        long tempCalculadoABP = 0;
        long tempCalculadoAVL = 0;

        /* Criação das arvores ABP & AVL */
        CArvBin abpAleatorio = new CArvBin();
        CArvAVL avlAleatorio = new CArvAVL();
        Random random = new Random();
        int nElementos = 17840;

        System.out.println("\n" + "Inserção Aleatoria (NºElementos:" + nElementos + "): ");

        /* Inserção dos valores e calculando tempo na árvore ABP */
        tempInicial = System.currentTimeMillis();
        for (int i = 1; i < nElementos; i++) {
            abpAleatorio.inserir(i);
            if (i == nElementos/2) // Inserir no meio da arvore o elemento -1 (Para fins de consulta)
                avlAleatorio.inserir(-1);
        }
        tempFinal = System.currentTimeMillis();
        tempCalculadoABP = (tempFinal - tempInicial);
        System.out.println("- ABP: " + tempCalculadoABP + "ms");


        /* Inserção dos valores e calculando tempo na árvore AVL */
        tempInicial = System.currentTimeMillis();
        for (int i = 1; i < nElementos; i++) {
            avlAleatorio.inserir(random.nextInt(1000));
            if (i == nElementos/2)
                avlAleatorio.inserir(-1); // Inserir no meio da arvore o elemento -1 (Para fins de consulta)
        }
        tempFinal = System.currentTimeMillis();
        tempCalculadoAVL = (tempFinal - tempInicial);
        System.out.println("- AVL: " + tempCalculadoAVL + "ms");

        ArrayList treeList = new ArrayList();
        treeList.add(0, abpAleatorio);
        treeList.add(1, avlAleatorio);

        return treeList;
    }

    private static void consultaCrescente(List<Object> treeList) {

        /* Declaraçao das variaveis TEMPO */
        long tempInicial;
        long tempFinal;
        long tempCalculadoABP = 0;
        long tempCalculadoAVL = 0;

        /* Armazenando em variavel as arvores ABP e AVL recebidas pela lista como parametro */
        CArvBin abpCrescente = (CArvBin) treeList.get(0);
        CArvAVL avlCrescente = (CArvAVL) treeList.get(1);

        System.out.println("Tempo para consultar o ultimo nó da árvore ");
        /* Calcula tempo de consulta do ultimo item da arvore ABP */
        tempInicial = System.currentTimeMillis();
        CNo noABPConsultado = abpCrescente.consultaNo(5000);
        tempFinal = System.currentTimeMillis();
        tempCalculadoAVL = (tempFinal - tempInicial);
        System.out.println("- ABP: " + tempCalculadoAVL + "ms");

        /* Calcula tempo de consulta do ultimo item da arvore AVL */
        tempInicial = System.currentTimeMillis();
        NoAVL noAVLConsultado = avlCrescente.consultaNo(5000);
        tempFinal = System.currentTimeMillis();
        tempCalculadoABP = (tempFinal - tempInicial);
        System.out.println("- AVL: " + tempCalculadoABP + "ms");
        System.out.print("-------------------------------------");
    }

    private static void consultaDecrescente(List<Object> treeList) {

        /* Declaraçao das variaveis TEMPO */
        long tempInicial;
        long tempFinal;
        long tempCalculadoABP = 0;
        long tempCalculadoAVL = 0;

        /* Armazenando em variavel as arvores ABP e AVL recebidas pela lista como parametro */
        CArvBin abpDecrescente = (CArvBin) treeList.get(0);
        CArvAVL avlDecrescente = (CArvAVL) treeList.get(1);

        System.out.println("Tempo para consultar o ultimo nó da árvore ");
        /* Calcula tempo de consulta do ultimo item da arvore ABP */
        tempInicial = System.currentTimeMillis();
        CNo noABPConsultado = abpDecrescente.consultaNo(10000);
        tempFinal = System.currentTimeMillis();
        tempCalculadoAVL = (tempFinal - tempInicial);
        System.out.println("- ABP: " + tempCalculadoAVL + "ms");

        /* Calcula tempo de consulta do ultimo item da arvore AVL */
        tempInicial = System.currentTimeMillis();
        NoAVL noAVLConsultado = avlDecrescente.consultaNo(10000);
        tempFinal = System.currentTimeMillis();
        tempCalculadoABP = (tempFinal - tempInicial);
        System.out.println("- AVL: " + tempCalculadoABP + "ms");
        System.out.print("-------------------------------------");
    }

}
