public class NodeStack implements IStack {
    Node top;
    int size;

    public NodeStack(){
        top = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (top == null);
    }

    @Override
    public String top() {
        if(isEmpty()){
            throw new RuntimeException("Pilha vazia");
        }
        return top.element;
    }

    @Override
    public void push(String element) {
        Node no = new Node(element);
        no.next = top;
        top = no;
        size++;
    }

    @Override
    public String pop() {
        if(isEmpty()){
            throw new RuntimeException("Pilha vazia");
        }

        String temp = top();
        top = top.next;
        size--;
        return  temp;
    }
}
