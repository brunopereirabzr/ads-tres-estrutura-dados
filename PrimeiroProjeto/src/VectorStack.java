public class VectorStack implements  IStack{
    int capacidade;
    String s[];

    int size = 0;

    public VectorStack(int capacidade){
        this.capacidade = capacidade;
        S = new String[capacidade];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String top() {
        return "";
    }

    @Override
    public void push(String element) {

    }

    @Override
    public String pop() {
        return "";
    }
}
