package ifma.lista02;

public class Lista02 {
    public static void main(String[] args) {
        System.out.println("------ Q01 ------");
        q01();
        System.out.println("------ Q02 ------");
        q02();
        System.out.println("------ Q03 ------");
        q03();
        System.out.print("------ Q04 ------");
        System.out.println(q04());
        System.out.println("------ Q05 ------");
        q05();
        System.out.print("------ Q06 ------");
        System.out.printf(" %.2f", q06());
        System.out.println();
        System.out.println("------ Q07 ------");
        q07();
        System.out.print("------ Q08 ------");
        System.out.println(q08());
        System.out.println("------ Q09 ------");
        q09();
        System.out.print("------ Q10 ------");
        System.out.println(q10());
        System.out.println("------ Q11 ------");
        q11();
        System.out.print("------ Q12 ------");
        System.out.println(q12());
    }

    public static void q01(){
        int matriz[][] = {  {1,2,3},
                            {4,5,6},
                            {7,8,9}};
        for(int i=0;i< matriz.length;i++){
            for(int j=0; j < matriz.length;j++){
                if(i==j){
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }//fim q01

    public static void q02(){
        int matriz[][] = {  {1,2,3}, // 00 01 02  02
                            {4,5,6}, // 10 11 12  11
                            {7,8,9}};// 20 21 22  20

        for(int i=0;i<matriz.length;i++){
            for(int j=2; j >= 0; j--){
                if (i + j == 2) {
                    matriz[i][j] = 0;
                }
            }
        }

        for(int i=0;i<matriz.length;i++){
            for(int j=0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }//fim q02

    public static void q03(){
        int matriz[][] = {  {1,2,3}, // 00 01 02  02
                            {4,5,6}, // 10 11 12  11
                            {7,8,9}};// 20 21 22  20

        for(int i=0;i<matriz.length;i++){
            for(int j=2; j >= 0; j--){
                if (i + j == 2) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }//fim q03

    public static int q04(){
        int matriz[][] = {  {1,2,3}, // 00 01 02  02
                            {4,5,6}, // 10 11 12  11
                            {7,8,9}};// 20 21 22  20
        int soma = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=2; j >= 0; j--){
                if (i + j == 2) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println();
        return soma;

    }//fim q04

    public static void q05(){
        int matriz[][] = {  {1,2,3}, // 00 01 02
                            {4,5,6}, // 10 11 12
                            {7,8,9}};// 20 21 22

        for(int i= 0; i < matriz.length; i++){
            for(int j = 2 - i; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }//fim q05

    public static float q06(){
        int matriz[][] = {  {1,2,3}, // 00 01 02
                            {4,5,6}, // 10 11 12
                            {7,8,9}};// 20 21 22

        float media = 0;
        float c = 0;
        float soma = 0;

        for(int i= 0; i < matriz.length; i++){
            for(int j = 2 - i; j < matriz.length; j++){
                soma += matriz[i][j];
                c++;
            }
        }
        media = soma/c;
        System.out.println();
        return media;
    }//fim q06

    public static void q07(){
        int matriz[][] = {  {1,2,3}, // 00 01 02
                            {4,5,6}, // 10 11 12
                            {7,8,9}};// 20 21 22
        for(int i = 1; i < matriz.length; i++){
            for(int j = matriz.length - i; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }//fim q07

    public static int q08(){
        int matriz[][] = {  {1,2,3}, // 00 01 02
                            {4,5,6}, // 10 11 12
                            {7,8,9}};// 20 21 22
        int maior = 0;
        for(int i = 1; i < matriz.length; i++){
            for(int j = matriz.length - i; j < matriz.length; j++){
                if(maior<matriz[i][j]){
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println();
        return maior;
    }//fim q08

    public static void q09(){
        int matriz[][] = {  {1,2,3}, // 00 01 02
                            {4,5,6}, // 10 11 12
                            {7,8,9}};// 20 21 22

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j <= 2 - i; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }//fim q09

    public static int q10(){
        int matriz[][] = {  {1,2,3}, // 00 01 02
                            {4,5,6}, // 10 11 12
                            {7,8,9}};// 20 21 22
        int menor = matriz[0][0];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j <= 2 - i; j++){
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println();
        return menor;
    }//fim q010

    public static void q11(){
        int matriz[][] = {  {1,2,3}, // 00 01 02
                            {4,5,6}, // 10 11 12
                            {7,8,9}};// 20 21 22

        for(int i = 0; i < matriz.length-1; i++){
            for(int j = 0; j < 2 - i; j++){
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }//fim q11

    public static int q12(){
        int matriz[][] = {  {1,2,3}, // 00 01 02
                            {4,5,6}, // 10 11 12
                            {7,8,9}};// 20 21 22

        int produto = 1;
        for(int i = 0; i < matriz.length-1; i++){
            for(int j = 0; j < 2 - i; j++){
                produto *= matriz[i][j];
            }
        }
        System.out.println();
        return produto;
    }//fim q11
}
