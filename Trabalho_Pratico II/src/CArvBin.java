import javax.swing.*;
import java.sql.SQLOutput;

public class CArvBin {

    private CNo raiz;

    public CArvBin() {
        raiz = null;
    }

    /* Método recursivo que insere novo nó */
    public void adicionar(int valor) {
        raiz = adicionarRecursivo(raiz, valor);
    }

    /* Método recursivo de inserção de valores na ABP */
    private CNo adicionarRecursivo(CNo no, int valor) {
        if (no == null)
            return new CNo(valor);
        if (valor < no.item)
            no.esquerda = adicionarRecursivo(no.esquerda, valor);
        else if (valor > no.item)
            no.direita = adicionarRecursivo(no.direita, valor);
        return no;
    }

    /* Imprime árvore BPM na forma escolhida */
    public void imprimir(String forma) {
        switch (forma) {
            case "preOrdem":
                System.out.println("Impressão (Pré-Ordem): ");
                preOrdem(raiz);
                break;
            case "emOrdem":
                System.out.println("Impressão (Em-Ordem): ");
                emOrdem(raiz);
                break;
            case "posOrdem":
                System.out.println("Impressao (Pos-Ordem: ");
                posOrdem(raiz);
                break;
            case "emOrdemDecrescente":
                System.out.println("Impressao (Ordem-Decrescente): ");
                emOrdemDecrescente(raiz);
                break;
            default:
                System.out.println("\nOpção invalida!");
                break;
        }
    }

    private void preOrdem(CNo no) {
        if (no != null) {
            System.out.print(no.item + ", "); /* Visita */
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }

    private void emOrdem(CNo no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.print(no.item + ", "); /* Visita */
            emOrdem(no.direita);
        }
    }

    private void posOrdem(CNo no) {
        if (no != null) {
            posOrdem(no.esquerda);
            posOrdem(no.direita);
            System.out.print(no.item + ", "); /* Visita */
        }
    }

    private void emOrdemDecrescente(CNo no) {
        if (no != null) {
            emOrdemDecrescente(no.direita);
            System.out.print(no.item + ", "); /* Visita */
            emOrdemDecrescente(no.esquerda);
        }
    }

    /* Método que retorna se possui o nó na arvore ABP */
    public boolean contem(int valor) {
        return contem(raiz, valor);
    }

    /* Método recursivo que busca nó */
    private boolean contem(CNo no, int valor) {
        if (no == null)
            return false;
        if (valor == no.item)
            return true;
        if (valor < no.item) {
            return contem(no.esquerda, valor);
        } else {
            return contem(no.direita, valor);
        }
    }

    /* Método iterativo de busca em ABP */
    public boolean achar(int id) {
        CNo no = raiz;
        while (no != null) {
            if (no.item == id)
                return true;
            else if (no.item > id)
                no = no.esquerda;
            else
                no = no.direita;
        }
        return false;
    }

    /* Chama função delete */
    public void delete(int valor) {
        raiz = deleteRecursivo(raiz, valor);
    }

    /* Método recursivo que exclui nó */
    private CNo deleteRecursivo(CNo no, int valor) {
        if (no == null)
            return null;

        if (valor == no.item) {
            if (no.esquerda == null && no.direita == null)
                return null;

            if (no.direita == null)
                return no.esquerda;

            if (no.esquerda == null)
                return no.direita;

            int menorValor = menorValor(no.direita);
            no.item = menorValor;
            no.direita = deleteRecursivo(no.direita, menorValor);
            return no;
        }

        if (valor < no.item) {
            no.esquerda = deleteRecursivo(no.esquerda, valor);
            return no;
        }
        no.direita = deleteRecursivo(no.direita, valor);
        return no;
    }

    /* Chama a funcao menorValor da árvore */
    public int menorValorArvore() {
        return menorValor(raiz);
    }

    /* Chama a funcao maiorValor da arvore */
    public int maiorvalorArvore() {
        return maiorValor(raiz);
    }

    /* Chama a funcao menor  Valor de um no passado por parametro */
    public int menorValorNo(int valor) {
        return menorValor(retornaNo(raiz, valor));
    }

    /* Chama a funcao maiorValor de um no passado por parametro */
    public int maiorValorNo(int valor) {
        return maiorValor(retornaNo(raiz, valor));
    }

    /* Retorna o menor valor em uma subárvore */
    private int menorValor(CNo no) {
        return no.esquerda == null ? no.item : menorValor(no.esquerda);
    }

    /* Retorna o maior valor de uma subárvore */
    private int maiorValor(CNo no) {
        return no.direita == null ? no.item : maiorValor(no.direita);
    }

    /* Chama função que retorna a altura do nó
       cujo o valor foi informado */
    public int altura(int valor) {
        return alturaRecursiva(retornaNo(raiz, valor));
    }

    /* Retorna a altura da árvore a partir de um nó */
    private int alturaRecursiva(CNo no) {
        if (no == null)
            return 0;
        return 1 + max(alturaRecursiva(no.esquerda), alturaRecursiva(no.direita));
    }

    /* Retorna o maior tamanho entre dois dados */
    private int max(int a, int b) {
        return a > b ? a : b;
    }

    /* Retorna o menor valor entre dois dados */
    private int min(int a, int b) {
        return a < b ? a : b;
    }

    /* Chama a funcao de profundidade recursiva */
    public int profundidade(int valor) {
        return profundidadeRecursiva(raiz, valor);
    }

    /* Funcao retorna a profundidade de um no */
    private int profundidadeRecursiva(CNo no, int valor) {
        if (no == null)
            return 0;
        if (no.item == valor)
            return 1;
        return 1 + (valor < no.item ? profundidadeRecursiva(no.esquerda, valor) : profundidadeRecursiva(no.direita, valor));
    }


    /* Funcao que chama a funcao de quantidade de filhos de uma arvore */
    public int quantidadeFilhos(int valor) {
        return qtdFilhos(retornaNo(raiz, valor)) - 1;
    }

    /* Determina a quantidade de filhos de um no */
    private int qtdFilhos(CNo no) {
        if (no == null)
            return 0;
        return 1 + qtdFilhos(no.esquerda) + qtdFilhos(no.direita);
    }

    /* Metodo que chama imprime completo */
    public void imprimeCompleto() {
        imprimeCompletoStr(raiz, null);
    }

    /* Método imprime diversas informações sobre no */
    private void imprimeCompletoStr(CNo no, CNo pai) {
        if (no != null) {
            imprimeCompletoStr(no.esquerda, no);
            System.out.println("Valor: " + no.item);
            System.out.println("Altura: " + alturaRecursiva(no));
            System.out.println("Profundidade: " + profundidadeRecursiva(raiz, no.item));
            System.out.println("Nó Pai: " + (pai == null ? "Não possui" : pai.item));
            System.out.println("Quantidade de filhos: " + quantidadeFilhos(no.item));
            System.out.println("Nó a esquerda: " + (no.esquerda == null ? "Não possui" : no.esquerda.item));
            System.out.println("Nó a direita: " + (no.direita == null ? "Não possui" : no.direita.item));
            System.out.println(eFolhaFinal(no) ? "É folha" : "Não é folha");
            System.out.println();
            imprimeCompletoStr(no.direita, no);
        }
    }

    /* Chama a funcao eFolha */
    public boolean eFolha(int valor) {
        return eFolhaFinal(retornaNo(raiz, valor));
    }

    /* Retorna se true caso o no seja folha e false caso seja intermediario */
    private boolean eFolhaFinal(CNo no) {
        return no.esquerda == null && no.direita == null;
    }

    /* Encontra e retorna um no passado por valor */
    private CNo retornaNo(CNo no, int valor) {
        if (no == null)
            return null;
        if (valor == no.item)
            return no;
        return retornaNo(valor < no.item ? retornaNo(no.esquerda, valor) : retornaNo(no.direita, valor), valor);
    }

    /* Chama a funcao de retorna indice */
    public int retornaIndice(int valor) {
        return retornaIndiceRecursivo(retornaNo(raiz, valor));
    }

    /* Retorna o indice de um nó */
    public int retornaIndiceRecursivo(CNo no) {
        if (no == null)
            return 0;
        return alturaRecursiva(no.esquerda) - alturaRecursiva(no.direita);
    }

    /* Imprime todos os nos folhas da arvore */
    public void imprimeNosFolha() {
        System.out.print("Nós folha: ");
        retornaNoFolha(raiz);
    }

    /* Retorna no folha */
    public void retornaNoFolha(CNo no){
        if (no == null)
            return;
        if (no.esquerda == null && no.direita == null)
            System.out.print(no.item + ", ");
        retornaNoFolha(no.esquerda);
        retornaNoFolha(no.direita);
    }

}