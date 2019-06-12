import treeStructures.CArvAVL;
import treeStructures.CArvBin;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AplicacaoArvore {
	
    static long tempInicial;
    static long tempFinal;
    static long tempCalculadoABP = 0;
    static long tempCalculadoAVL = 0;
    
    
	static int nElementos = 500000;
	static int[] vetorAleatorio = new int [nElementos];
	private static ArrayList<Object> treeList;
	
    public static void main(String[] args) {
    	
    	preencheVetorAleatorio();
        consultaCrescente(calculaTempoInsercaoCrescente());
        consultaDecrescente(calculaTempoInsercaoDecrescente());
        consultaAleatorio(calculaTempoInsercaoAleatorio());

    }
    
    private static void preencheVetorAleatorio() {	
    	Random random = new Random();
    	for (int i = 0; i < nElementos; i++ ){
    		vetorAleatorio[i] = random.nextInt(nElementos);
    	}
    }

    private static List<Object> calculaTempoInsercaoCrescente(){

        /* Criacao das arvores ABP & AVL */
        CArvBin abpCrescente = new CArvBin();
        CArvAVL avlCrescente = new CArvAVL();
        System.out.println("--------------------------------------------");
        System.out.println("Insercao Ordem-Crescente (NºElementos:" + nElementos + "): ");

        /* Insercao dos valores e calculando tempo na arvore ABP */
        tempInicial = System.currentTimeMillis();
        for (int i = 1; i <= nElementos; i++)
            abpCrescente.inserir(i);
        tempFinal = System.currentTimeMillis();
        tempCalculadoABP = (tempFinal - tempInicial);
        System.out.println("- ABP: " + tempCalculadoABP + "ms");


        /* Insercao dos valores e calculando tempo na Ã¡rvore AVL */
        tempInicial = System.currentTimeMillis();
        for (int i = 1; i <= nElementos; i++)
            avlCrescente.inserir(i);
        tempFinal = System.currentTimeMillis();
        tempCalculadoAVL = (tempFinal - tempInicial);
        System.out.println("- AVL: " + tempCalculadoAVL + "ms");

        treeList = new ArrayList<Object>();
        treeList.add(0, abpCrescente);
        treeList.add(1, avlCrescente);

        return treeList;
    }

    private static List<Object> calculaTempoInsercaoDecrescente(){

        /* Criacao das arvores ABP & AVL */
        CArvBin abpDecrescente = new CArvBin();
        CArvAVL avlDecrescente = new CArvAVL();

        System.out.println("\n" + "Insercao Ordem-Decrescente (NºElementos:" + nElementos + "):");

        /* Insercao dos valores e calculando tempo na arvore ABP */
        tempInicial = System.currentTimeMillis();
        for (int i = nElementos; i >= 1; i--)
            abpDecrescente.inserir(i);
        tempFinal = System.currentTimeMillis();
        tempCalculadoABP = (tempFinal - tempInicial);
        System.out.println("- ABP: " + tempCalculadoABP + "ms");

        /* Insercao dos valores e calculando tempo na arvore AVL */
        tempInicial = System.currentTimeMillis();
        for (int i = nElementos; i >= 1; i--)
            avlDecrescente.inserir(i);
        tempFinal = System.currentTimeMillis();
        tempCalculadoAVL = (tempFinal - tempInicial);
        System.out.println("- AVL: " + tempCalculadoAVL + "ms");

        ArrayList<Object> treeList = new ArrayList<Object>();
        treeList.add(0, abpDecrescente);
        treeList.add(1, avlDecrescente);

        return treeList;
    }

    private static List<Object> calculaTempoInsercaoAleatorio(){

        /* Criacao das arvores ABP & AVL */
        CArvBin abpAleatorio = new CArvBin();
        CArvAVL avlAleatorio = new CArvAVL();

        System.out.println("\n" + "Insercao Aleatoria (NºElementos:" + nElementos + "): ");

        /* Insercao dos valores e calculando tempo na arvore ABP */
        tempInicial = System.currentTimeMillis();
        for (int i = 1; i < nElementos; i++) 
            abpAleatorio.inserir(vetorAleatorio[i]);  
        tempFinal = System.currentTimeMillis();
        tempCalculadoABP = (tempFinal - tempInicial);
        System.out.println("- ABP: " + tempCalculadoABP + "ms");

        /* Insercao dos valores e calculando tempo na arvore AVL */
        tempInicial = System.currentTimeMillis();
        for (int i = 1; i < nElementos; i++)
            avlAleatorio.inserir(vetorAleatorio[i]);
        tempFinal = System.currentTimeMillis();
        tempCalculadoAVL = (tempFinal - tempInicial);
        System.out.println("- AVL: " + tempCalculadoAVL + "ms");

        ArrayList<Object> treeList = new ArrayList<Object>();
        treeList.add(0, abpAleatorio);
        treeList.add(1, avlAleatorio);

        return treeList;
    }

    private static void consultaCrescente(List<Object> treeList) {

        /* Armazenando em variavel as arvores ABP e AVL recebidas pela lista como parametro */
        CArvBin abpCrescente = (CArvBin) treeList.get(0);
        CArvAVL avlCrescente = (CArvAVL) treeList.get(1);

        System.out.println("Tempo para consultar o ultimo no da arvore ");
        /* Calcula tempo de consulta do ultimo item da arvore ABP */
        tempInicial = System.currentTimeMillis();
        for (int i = 1; i <= nElementos; i++)
        	abpCrescente.consultaNo(i);
        tempFinal = System.currentTimeMillis();
        tempCalculadoABP = (tempFinal - tempInicial);
        System.out.println("- ABP: " + tempCalculadoABP + "ms");

        /* Calcula tempo de consulta do ultimo item da arvore AVL */
        tempInicial = System.currentTimeMillis();
        for (int i = 1; i <= nElementos; i++)
        	avlCrescente.consultaNo(i);
        tempFinal = System.currentTimeMillis();
        tempCalculadoAVL = (tempFinal - tempInicial);
        System.out.println("- AVL: " + tempCalculadoAVL + "ms");
        System.out.print("-------------------------------------");
    }

    private static void consultaDecrescente(List<Object> treeList) {

        /* Armazenando em variavel as arvores ABP e AVL recebidas pela lista como parametro */
        CArvBin abpDecrescente = (CArvBin) treeList.get(0);
        CArvAVL avlDecrescente = (CArvAVL) treeList.get(1);

        System.out.println("Tempo para consultar o ultimo no da arvore ");
        /* Calcula tempo de consulta do ultimo item da arvore ABP */
        tempInicial = System.currentTimeMillis();
        for (int i = nElementos; i > 0; i--)
        	 abpDecrescente.consultaNo(i);
        tempFinal = System.currentTimeMillis();
        tempCalculadoABP = (tempFinal - tempInicial);
        System.out.println("- ABP: " + tempCalculadoABP + "ms");

        /* Calcula tempo de consulta do ultimo item da arvore AVL */
        tempInicial = System.currentTimeMillis();
        for (int i = nElementos; i > 0; i--)
        	avlDecrescente.consultaNo(i);
        tempFinal = System.currentTimeMillis();
        tempCalculadoAVL = (tempFinal - tempInicial);
        System.out.println("- AVL: " + tempCalculadoAVL + "ms");
        System.out.print("-------------------------------------");
    }

    private static void consultaAleatorio(List<Object> treeList) {

        /* Declaracao das variaveis TEMPO */
        long tempInicial;
        long tempFinal;
        long tempCalculadoABP = 0;
        long tempCalculadoAVL = 0;

        /* Armazenando em variavel as arvores ABP e AVL recebidas pela lista como parametro */
        CArvBin abpAleatorio = (CArvBin) treeList.get(0);
        CArvAVL avlAleatorio = (CArvAVL) treeList.get(1);

        System.out.println("Tempo para consultar o ultimo na da arvore ");
        /* Calcula tempo de consulta do ultimo item da arvore ABP */
        tempInicial = System.currentTimeMillis();
        for (int i = 1; i < nElementos; i++)
        	abpAleatorio.consultaNo(vetorAleatorio[i]);
        tempFinal = System.currentTimeMillis();
        tempCalculadoABP = (tempFinal - tempInicial);
        System.out.println("- ABP: " + tempCalculadoABP + "ms");

        /* Calcula tempo de consulta do ultimo item da arvore AVL */
        tempInicial = System.currentTimeMillis();
        for (int i = 1; i < nElementos; i++)
        	avlAleatorio.consultaNo(vetorAleatorio[i]);
        tempCalculadoAVL = (tempFinal - tempInicial);
        System.out.println("- AVL: " + tempCalculadoAVL + "ms");
        System.out.print("-------------------------------------");
    }

}
