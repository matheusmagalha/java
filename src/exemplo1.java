public class exemplo1 {
    public static void main(String[] args) {


        int[][] matriz = {{1, -2, 3}, {4, -5, 6}, {-7, 8, 9}};



        float [][]salarios = new float[5][5];

        System.out.println("item matriz " +matriz[2][2]);

        matriz [2] [2]= 90;

        System.out.println("item matriz " +matriz[2][2]);

        System.out.println("matriz " +matriz);

        for(int i = 0; i <matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.printf("matriz [%d} [%d]: %d\n", i ,j,matriz[i] [j]);
            }
        }
        int soma=0;
        for(int i=0; i<matriz.length;i++){
            for (int j=0; j<matriz[i].length; j++){
                soma += matriz[i][j];

            }
        }
        System.out.println("somatoria: "+ soma);

        int qtde=0;
        for (int linha=0; linha<matriz.length; linha++){
            for (int coluna=0; coluna<matriz[linha].length; coluna++){
                if (matriz[linha] [coluna]<0) {
                    System.out.println("negativo: " +matriz[linha][coluna]);
                    qtde++;;
                }
            }
        }
        System.out.println("quantidade de negativos: " +qtde);
    }
}
