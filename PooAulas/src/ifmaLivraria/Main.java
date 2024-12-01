package ifmaLivraria;

public class Main {
    public static void main(String[] args) {
        Livraria livro = new Livraria();

        Livro livro1 = new Livro();
        livro1.setNome("Livro de java");
        livro1.setDescricao("Livro sobre Java");
        livro1.setValor(49.99);
        livro1.setIsbn("123-31-121-31");

        Livro livro2 = new Livro();
        livro2.setNome("Livro de C");
        livro2.setDescricao("Livro sobre C");
        livro2.setValor(59.99);
        livro2.setIsbn("321-13-345-67");

        Livro livro3 = new Livro();
        livro3.setNome("Livro de JavaScript");
        livro3.setDescricao("Livro sobre javaScript");
        livro3.setValor(39.99);
        livro3.setIsbn("789-44-736-09");

        livro.adicionar(livro1);
        livro.adicionar(livro2);
        livro.adicionar(livro3);
        livro.removerNoInicio();
        livro.removerNoFinal();

        System.out.println(livro.toString());

    }
}
