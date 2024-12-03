package ifma.lista02;

public class Lista02 {
    public static void main(String[] args) {
        q01();
        q02();
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
        int matriz[][] = {  {1,2,3}, // 02
                            {4,5,6}, // 11
                            {7,8,9}}; //20
        
        for(int i=0;i< matriz.length;i++){
            for(int j=0; j < matriz.length;j++){
                if(i==j){
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }//fim q02
}
