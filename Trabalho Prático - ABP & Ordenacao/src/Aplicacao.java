import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {

        List crescente = new ArrayList();
        List decrescente = new ArrayList();
        List aleatorio = new ArrayList();


        CArvBin arvoreBin = new CArvBin();
        CArvAVL arvoreAVL = new CArvAVL();

        arvoreAVL.inserir(5);
        arvoreAVL.inserir(10);
        arvoreAVL.inserir(12);

        arvoreBin.adicionar(5);


        //System.out.println(arvore.quantidadeFilhos(40));
    }

}
