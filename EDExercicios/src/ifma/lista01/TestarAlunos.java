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

        String nome = cadastro.removerComIndice(1);


        Aluno aluno1 = new Aluno(11,"024","Aluno1");
        cadastro.adicionarNoInicio(aluno1);

        Aluno aluno2 = new Aluno(5,"024","Aluno2");
        cadastro.adicionarNoInicio(aluno2);

        Aluno aluno3 = new Aluno(7,"024","Aluno3");
        cadastro.adicionarNoFinal(aluno3);

        String nome2 = cadastro.removerComIndice(3);
        cadastro.ordenarVetor();

        System.out.println(cadastro.toString());
        System.out.println("size: "+ cadastro.size());
        System.out.println(cadastro.verificarIndice(-1));
        System.out.println(nome2);
    }
}
