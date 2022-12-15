package Aula04;

import java.util.Scanner;

public class exercicioMatriz {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o tamanho da matriz:");
        int tamanho = scan.nextInt();
        int matrix [][] = new int [tamanho][tamanho];
        for(int linha = 0; linha < matrix.length; linha ++ ){
            for(int colunas = 0; colunas < matrix[linha].length; colunas++){
               matrix[linha][colunas] = 0;
               System.out.print(matrix[linha][colunas] + " "); 
            }
            System.out.println();
        }
    }
}
