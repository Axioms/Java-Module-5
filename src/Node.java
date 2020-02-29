public class Node {
    
    private String data;
    private int count;
    private Node next;
    private Node prev;
    
    public Node() {}

    public Node(String data) {
        this.data = data;
        this.count = 1;
    }

    public Node(String data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(String data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public int getCount() {
        return count;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void nullify(){
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return "Type: " + data + "\t" + "Count: " + count;
    }
}