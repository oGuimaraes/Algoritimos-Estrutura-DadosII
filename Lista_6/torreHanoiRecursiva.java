public class torreHanoiRecursiva {
   public static void main(String[] args){
      int discos = 3;
      int movimentos = 0;
      torreHanoi(discos, 'A', 'B', 'C');
   }
   
   private static void torreHanoi(int discos, char origem, char auxiliar, char destino){
      if(discos > 0){
         torreHanoi(discos-1, origem, destino, auxiliar);
         System.out.printf("Mover de %s para %s \n", origem, destino);
         torreHanoi(discos-1, auxiliar, origem, destino);
      }
   }
}