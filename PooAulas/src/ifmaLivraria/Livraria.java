package ifmaLivraria;

import javax.management.relation.RoleInfoNotFoundException;

public class Livraria {
    private int capacidade = 5;
    private  int size;

    //criando um vetor
    private Livro livros[];

    public Livraria(){
        size = 0;
        //Informando o tamanho do vetor
        livros = new Livro[capacidade];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void adicionar(Livro livro){
        if (capacidade == size){
            throw new RuntimeException("Vetor cheio");
        }

        livros[size] = livro;
        size++;
    }

    public Livro buscarLivro(String nomeLivro){
        if(isEmpty()){
            throw new RuntimeException("Vetor vazio");
        }
        for(int i =0; i< size;i++){
            String livroAcessado = livros[i].getNome();
            if(livroAcessado.equals(nomeLivro)){
                return livros[i];
            }
        }
        throw new RuntimeException("Livro não encontrado");
    }

    public String removerNoFinal(){
        if (isEmpty()){
            throw  new RuntimeException("Vetor vazio");
        }
        String temp = livros[size-1].getNome();
        livros[size-1] = null;
        size--;
        return temp;
    }

    public String removerNoInicio(){
        if (isEmpty()){
            throw new RuntimeException("Vetor vazio");
        }
        String temp = livros[0].getNome();
        for(int i = 0; i <size; i++){
            if(i == size-1){
                livros[i] = null;
                break;
            }
            livros[i] = livros[i+1];
        }
        size--;
        return temp;
    }

    public String toString(){
        String s = "[\n";
        for(int i=0;i<size;i++){
            s += livros[i].getNome()
                    + ", " + livros[i].getValor() + "\n";

        }
        return s + "]";
    }
}
