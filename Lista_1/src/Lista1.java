package lista1;
import java.util.Scanner;

public class Lista1 {
    
    private static Scanner entrada;
    
	//               Menu                  //

	public static void menu(){
		System.out.println("");
        System.out.println("       Menu");
        System.out.println("----------------");
        System.out.println("1. Exercicio 1");
        System.out.println("3. Exercicio 3");
        System.out.println("4. Exercicio 4");
        System.out.println("6. Exercicio 6");
        System.out.println("12. Exercicio 12");
        System.out.println("13. Exercicio 13");
        System.out.println("17. Exercicio 17");
        System.out.println("18. Exercicio 18");
        System.out.println("19. Exercicio 19");
        System.out.println("20. Exercicio 20");
        System.out.println("----------------");
        System.out.print("Opcao: ");

    }
	
	public static void main(String[] args) {
        int opcao;
        entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            System.out.print("\n");
            
            switch(opcao){
            case 1:
                exercicio1();
                break;
                
            case 3:
                exercicio3();
                break;
                
            case 4:
                exercicio4();
                break;
                
            case 6:
                exercicio6();
                break;
                
            case 12:
                exercicio12();
                break;
                
            case 13:
                exercicio13();
                break;
                
            case 17:
                exercicio17();
                break;
            
            case 18:
            	exercicio18();
            	break;
            	
            case 19:
            	exercicio19();
            	break;
            	
            case 20:
            	exercicio20();
            	break;
            	
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }

    public static void exercicio1(){
        int[] alturaRetangulos = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] larguraRetangulos = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        float[] area = new float[10];
        float[] perimetro = new float[10];
        
        for (int i = 0; i < 10; i++) {
        	area[i] = alturaRetangulos[i] * larguraRetangulos[i];
        	perimetro[i] = 2 * (alturaRetangulos[i] + larguraRetangulos[i]);
        }
        
        for (int i = 0; i < 10; i++) {
        	System.out.println("Retângulo " + (i+1) + ": { Area: " + area[i] + ", Perímetro: " + perimetro[i]+ "}");
        }
    }
    
    public static void exercicio3(){
    	double area;
    	System.out.println("Circuferências");
        for (int i = 10; i <= 100; i++) {
        	area = 3.14 * i * i;
        	System.out.printf("raio(%d): %.1f \n",i, area);
        }
    }
    
    public static void exercicio4(){
    	double area;
    	System.out.println("Circuferências!");
    	
        for (int i = 1; i <= 50; i++) {
        	if ((i & 1) == 1) {
            	area = 3.14 * i * i;
            	System.out.printf("raio(%d): %.1f \n",i, area);	
        	}

        }
    }
    
    public static void exercicio6(){
    	double area;
    	System.out.println("Circuferências");
        for (float i = 1; i <= 10.1; i = (float) (i + 0.1)) {
        	area = 3.14 * i * i;
        	System.out.printf("raio(%.1f): %.1f \n",i, area);
        }
    }
    
    public static void exercicio12() {
    	
    	for (int i = 1; i <= 10; i++) {
    		for (int j = 1; j <= 10; j++) {
    			System.out.println("\t" + i + " * " + j + " = " + (i*j));
    		}
    		System.out.println("");
    	}	
    }
    
    public static void exercicio13() {
    	
        float aux = 0;
        int i;
        
        System.out.println("Escreva um número (A): ");
        float a = entrada.nextFloat();
        
        System.out.println("Escreva um número (B): ");
        int b = entrada.nextInt();
        
        for (i = 0; i < b; i++)
        {
            aux+=a;
        }
        System.out.println("A * B = " + aux);
        
    }
    
    public static void exercicio17() {
        int fat;
        System.out.println("Escreva um número: ");
        int n = entrada.nextInt();

        for (fat = 1; n > 1; n--) {
            fat = fat * n;
        }
        System.out.printf("Fatorial: %d\n", fat);
    }
    
    public static void exercicio18() {
        int a = 1, b = 1, cont;
        long c;

        System.out.println("Escolha um número: ");
        int numero = entrada.nextInt();

        System.out.printf("Sequência de Fibonacci: %d %d ",a, b);

        for (cont = 0; cont < numero; cont++)
        {
            c = a+b;
            System.out.printf("%d ", c);
            a = b;
            b = (int) c;
        };
    }
    
    public static void exercicio19() {
    	float somaEquacao = 0;
    	
    	System.out.println("Escreva um valor para H: ");
    	int h = entrada.nextInt();
    	
    	for (int i = h; i >= 1; i--) {
    		somaEquacao += (1.0/h);
    		System.out.print("(1/" + h + ") + ");
    		h--;
    	}
    	System.out.println("= " + somaEquacao);
    }
    
    public static void exercicio20() {
    	float somaEquacao = 0;
    	float a = (float) 1.0, b = (float) 1.0;
    	
    	System.out.println("Escreva um valor para L: ");
    	int l = entrada.nextInt();
    	
    	for (int i = 0; i < l; i++) {
    		somaEquacao += (a/Math.sqrt(b));
    		System.out.print("(" + a + "/" + "raiz(" + b + ") + ");
    		a++;
    		b += 2;
    	}
    	System.out.println("= " + somaEquacao);
    }
    
}
