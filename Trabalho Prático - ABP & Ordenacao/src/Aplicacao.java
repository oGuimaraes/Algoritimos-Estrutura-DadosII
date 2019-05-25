import treeStructures.CArvAVL;
import treeStructures.CArvBin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aplicacao {

    public static void main(String[] args) {

        calculaTempoInsercaoCrescente();
        calculaTempoInsercaoDecrescente();
        calculaTempoInsercaoAleatorio();
        
    }

    private static void calculaTempoInsercaoCrescente(){

        /* Declaraçao das variaveis TEMPO */
        long tempInicial;
        long tempFinal;
        long tempCalculadoABP = 0;
        long tempCalculadoAVL = 0;

        /* Criação das arvores ABP & AVL */
        CArvBin abpCrescente = new CArvBin();
        CArvAVL avlCrescente = new CArvAVL();
        int nElementos = 17840;

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

    }

    private static void calculaTempoInsercaoDecrescente(){

        /* Declaraçao das variaveis TEMPO */
        long tempInicial;
        long tempFinal;
        long tempCalculadoABP = 0;
        long tempCalculadoAVL = 0;

        /* Criação das arvores ABP & AVL */
        CArvBin abpDecrescente = new CArvBin();
        CArvAVL avlDecrescente = new CArvAVL();
        int nElementos = 17840;

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

    }

    private static void calculaTempoInsercaoAleatorio(){

        /* Declaraçao das variaveis TEMPO */
        long tempInicial;
        long tempFinal;
        long tempCalculadoABP = 0;
        long tempCalculadoAVL = 0;

        /* Criação das arvores ABP & AVL */
        CArvBin abpCrescente = new CArvBin();
        CArvAVL avlCrescente = new CArvAVL();
        Random random = new Random();
        int nElementos = 17840;

        System.out.println("\n" + "Inserção Aleatoria (NºElementos:" + nElementos + "): ");

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
            avlCrescente.inserir(random.nextInt(1000));
        }
        tempFinal = System.currentTimeMillis();
        tempCalculadoAVL = (tempFinal - tempInicial);
        System.out.println("- AVL: " + tempCalculadoAVL + "ms");

    }

}
