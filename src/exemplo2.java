import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class exemplo2 {
    public static int[][] CriarMatriz(int lin, int col) {

        System.out.println("*___Criando Matriz___*");
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[lin][col];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d] [%d]: ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }
        return matriz;
    }


    public static void imprimir(int[][] matriz) {
        System.out.println("*___imprimindo matriz___*");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz[%d] [%d]: %d\n", i, j, matriz[i][j]);

            }
        }
    }

    public static int Somatoria(int[][] matriz) {
        System.out.println("*___Somatoria___*");
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public static int qtdeNegativos(int [][] matriz){
        System.out.println("*___quantidade de negativos___*");
        int cont = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static int [] definirTamanho (){
        System.out.println("*___tamanho da matriz");
        Scanner input = new Scanner(System.in);
        int []vetor = new int[2];


        System.out.println("Linhas: ");
        vetor[0] = input.nextInt();
        System.out.println("Colunas: ");
        vetor[1] = input.nextInt();

        return vetor;
    }


    public static void main(String[] args) {
        int[] v = definirTamanho();
        int[][] matriz = CriarMatriz(v[0],v[1]);
        imprimir(matriz);

        System.out.println("somatoria: " + Somatoria(matriz));
        System.out.println("negativos: " + qtdeNegativos(matriz));
    }
}

