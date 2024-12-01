package ifma.lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        CadastrarAlunos cadastro = new CadastrarAlunos(5);

        Aluno bruno = new Aluno(1,"123","Bruno");
        cadastro.adicionarNoFinal(bruno);

        Aluno maria = new Aluno(4,"321","Maria");
        cadastro.adicionarNoFinal(maria);

        Aluno genny = new Aluno(6,"876","Genny");
        cadastro.adicionarNoInicio(genny);

        Aluno adna = new Aluno(8,"435","Adna");
        cadastro.adicionarNoInicio(adna);

        Aluno franciane = new Aluno(33,"024","Franciane");
        cadastro.adicionarNoInicio(franciane);

        cadastro.removerNoInicio();
        cadastro.removerNoFinal();



        System.out.println(cadastro.toString());
        System.out.println("size: "+ cadastro.size());
        System.out.println(cadastro.verificarIndice(-1));
    }
}
