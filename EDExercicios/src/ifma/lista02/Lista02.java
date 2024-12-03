package ifma.lista02;

public class Lista02 {
    public static void main(String[] args) {
        System.out.println("------ Q01 ------");
        q01();
        System.out.println("------ Q02 ------");
        q02();
        System.out.println("------ Q03 ------");
        q03();
        System.out.println("------ Q04 ------");
        System.out.println(q04());
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
}
