import treeStructures.CArvAVL;
import treeStructures.CArvBin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aplicacao {

    public static void main(String[] args) {

        /* Criação das arvores ABP & AVL */
        CArvBin abpCrescente = new CArvBin();
        CArvBin abpDecrescente = new CArvBin();
        CArvBin abpAleatorio = new CArvBin();

        CArvAVL arvoreAVL = new CArvAVL();

        Random random = new Random();

        List crescente = new ArrayList();
        List decrescente = new ArrayList();
        List aleatorio = new ArrayList();
        int nAleatorio;

        for (int i = 1; i <= 10000000; i++){
            arvoreAVL.inserir(i);
        }

        for (int i = 10000000; i >= 1; i--){
            decrescente.add(i);
        }

        for (int i = 1; i <= 10000000; i++){
            nAleatorio = random.nextInt(1000);
            aleatorio.add(nAleatorio);
        }


    }


}
