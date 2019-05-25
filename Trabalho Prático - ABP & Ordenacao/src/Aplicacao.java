public class Aplicacao {

    public static void main(String[] args) {

        CArvBin arvore = new CArvBin();
        arvore.adicionar(40);
        arvore.adicionar(78);
        arvore.adicionar(68);
        arvore.adicionar(50);
        arvore.adicionar(45);
        arvore.adicionar(71);
        arvore.adicionar(46);
        arvore.adicionar(45);
        arvore.adicionar(55);
        arvore.adicionar(49);
        arvore.adicionar(90);
        arvore.adicionar(75);
        arvore.imprimir("preOrdem");
        System.out.println("\n");
        arvore.imprimir("emOrdem");
        System.out.println("\n");
        arvore.imprimir("posOrdem");
        System.out.println("\n");
        arvore.imprimir("emOrdemDecrescente");

        //System.out.println(arvore.quantidadeFilhos(40));
    }

}
