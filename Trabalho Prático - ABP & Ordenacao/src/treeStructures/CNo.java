package treeStructures;

public class CNo {
    public int item;
    public CNo direita, esquerda;

    public CNo(int valorItem) {
        item = valorItem;
        direita = esquerda = null;
    }

    public CNo(int valorItem, CNo noEsquerda, CNo noDireita) {
        item = valorItem;
        direita = noDireita;
        esquerda = noEsquerda;
    }
}