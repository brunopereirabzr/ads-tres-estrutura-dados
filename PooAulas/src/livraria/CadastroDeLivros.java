package livraria;

public class CadastroDeLivros {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setNome("Ententendo algoritmos");
        livro.setDescricao("Descrição do livro");
        livro.setValor(59.90);
        livro.setIsbn("111-222-333");

        livro.mostrarDetalhes();
    }
}
