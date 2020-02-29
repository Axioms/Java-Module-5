public class BirdSurvey {
    private int length;
    private Node h;
    private Node t;


    public BirdSurvey() {
        this.length = 0;
    }

    private void addLink(Node temp, Node cN) {
        temp.setPrev(cN);
        temp.setNext(cN.getNext());
        cN.setNext(temp);
        temp.getNext().setPrev(temp);
    }

    private void delLink(Node dN) {
        length--;
        dN.getPrev().setNext(dN.getNext());
        dN.getNext().setPrev(dN.getPrev());
        dN.nullify();
    }

    public boolean isEmpty() {
        return h == null;
    }

    public int length() {
        return length;
    }

    public void add(String data) {

        if(getCount(data) > 0) {
            Node cN = h;
            for (int i=0; i < length; i++) {
                if(cN.getData().equals(data)) {
                    cN.setCount((cN.getCount() + 1));
                }
                cN = cN.getNext();
            }
        }

        else {
            Node temp = new Node(data);
            if (h == null) {
                h = temp;
                t = temp;
            } else {
                temp.setPrev(t);
                t.setNext(temp);
                t = temp;
            }
            length++;
        }
    }

    public int getCount(String bird) {
        Node cN = h;
        for (int i=0; i < length; i++) {
            if(cN.getData().equals(bird)) {
                return cN.getCount();
            }
            cN = cN.getNext();
        }

        return 0;
    }

    public String getReport() {
        String temp = "\n\n";
        Node cN = h;

        for(int i=0; i < length; i++) {
            temp = temp + "\n" + cN;
            cN = cN.getNext();
        }
        return temp;
    }

    @Override
    public String toString() {
        String temp = "[";
        Node cN = h;

        for (int i=0; i < length; i++) {
            temp = temp + cN.getData();
            if(i != length -1) {
                temp = temp + ", ";
            }
            cN = cN.getNext();
        }

        return temp + "]";
    }
}