package ifma.lista01;

import java.util.Arrays;

public class CadastrarAlunos {
    private  int size;
    private int capacidade;

    private Aluno alunos[];

    public CadastrarAlunos(int capacidade){
        this.capacidade = capacidade;
        size = 0;
        alunos = new Aluno[capacidade];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void adicionarNoFinal(Aluno aluno){
        if (capacidade == size){
            throw new RuntimeException("Vetor cheio!");
        }
        alunos[size] = aluno;
        size++;
    }

    public void adicionarNoInicio(Aluno aluno){
        if (capacidade == size){
            throw new RuntimeException("Vetor cheio!");
        }
        for (int i=size;i>=0;i--){
            if(i==0){
                alunos[i] = aluno;
                break;
            }
            alunos[i] = alunos[i-1];
        }
        size++;
    }


    public String removerNoFinal(){
        if (isEmpty()){
            throw  new RuntimeException("Vetor vazio");
        }
        String temp = alunos[size-1].getNome();
        alunos[size-1] = null;
        size--;
        return temp;
    }

    public String removerNoInicio(){
        if (isEmpty()){
            throw new RuntimeException("Vetor vazio");
        }
        String temp = alunos[0].getNome();
        for(int i = 0; i <size; i++){
            if(i == size-1){
                alunos[i] = null;
                break;
            }
            alunos[i] = alunos[i+1];
        }
        size--;
        return temp;
    }

    public String toString(){
        String s = "[\n";
        for(int i=0;i<size;i++){
            s += alunos[i].getNome()
                    + ", " + alunos[i].getCodigo() + "\n";
        }
        return s + "]";
    }

    public  boolean verificarIndice(int indice){
        if (isEmpty()){
            throw new RuntimeException("Vetor vazio");
        }
        if(indice>=0 && indice < size){
            if (alunos[indice] != null){
                return true;
            }
        }
        return false;
    }

    public String removerComIndice(int indice){
        String alunoIndice = "";
        if (isEmpty()){
            throw new RuntimeException("Vetor vazio!");
        }
        if(verificarIndice(indice) == false){
            throw new RuntimeException("Indice não se enconta no vetor");
        }
        if (indice == 0){
            String temp = alunos[indice].getNome();
            removerNoInicio();
            return temp;
        }
        if (indice==size-1){
            String temp = alunos[indice].getNome();
            removerNoFinal();
            return temp;
        }
        for(int i=0;i<size;i++){
            if(i==indice){
                alunoIndice = alunos[i].getNome();
                int j = i;
                while (j<size){
                    if (j==size-1){
                        alunos[j] = null;
                        break;
                    }
                    alunos[j] = alunos[j+1];
                    j++;
                }
                size--;
                break;
            }
        }
        return alunoIndice;
    }

    public void ordenarVetor(){
        Aluno aluno;
        for (int i = 0; i < size;i++){
            for(int j = 0;j<size;j++){
                if(alunos[i].getCodigo()<alunos[j].getCodigo()){
                    aluno = alunos[i];
                    alunos[i] = alunos[j];
                    alunos[j] = aluno;
                }
            }
        }
    }
}
