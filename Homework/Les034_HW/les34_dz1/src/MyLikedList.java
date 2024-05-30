public class MyLikedList implements MyList{
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    @Override
    public boolean add(String element) {
        Node node = new Node(tail, null, element);
        size++;
        if (tail!=null){
            tail.setNext(node);
        }
        if (head==null){
            head = node;
        }
        tail = node;
        return true;
    }

    @Override
    public boolean add(int index, String element) {
        Node nodeIndex = getNode(index);
        Node node = new Node(nodeIndex, nodeIndex.getNext(), element);
        size++;
        if (tail!=null){
            nodeIndex.setNext(node);
        }
        if (head==null){
            head = node;
        }
        tail = node;
        return true;
    }

    @Override
    public String get(int index) {
        Node node = getNode(index);
        return (node!=null)?node.getValue():null;
    }

    private Node getNode(int index){
        if (index>=size || index<0 || head==null){
            return null;
        }
        int counter = 0;
        Node aktiveNode = head;
        while (aktiveNode!=null && counter<index){
            aktiveNode = aktiveNode.getNext();
            counter++;
        }
        return aktiveNode;
    }

    @Override
    public int size() {
        return size;
    }

    private String remove(Node node){// удоляем ноду
        if (node==null){
            return null;
        }
        Node prev = node.getPrev();
        Node next = node.getNext();

        if (prev!=null){
            prev.setNext(next);
        } else {
            head = next;
        }
        if (next!=null){
            next.setPrev(prev);
        } else {
            tail = prev;
        }
        size--;
        node.setPrev(null);
        node.setNext(null);
        String removedValue = node.getValue();
        return removedValue;
    }

    @Override
    public String remove(int index) {
        Node node = getNode(index); // ищит ноду
        return remove(node);
    }

    @Override
    public String remove() {
        return remove(tail);
       /* if (tail!=null){ // список не пустой
            Node prev = tail.getPrev();
            String removedValue = tail.getValue();
            if (prev==null){ // когда список из одного элемента
                head = null;
                tail = null;
            } else {
                prev.setNext(tail.getNext());
                tail.setPrev(null);
                tail = prev;
            }
            size --;
            return removedValue;
        } else { // список пустой
            return null;
        }*/
    }

    @Override
    public String set(int index, String element) {
        return null;
    }

    @Override
    public String toString() {
        if (head==null){
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        Node currenNode = head;
        while (currenNode!=null){
            sb.append(currenNode.getValue()).append(";");
            currenNode=currenNode.getNext();
        }
        sb.setLength(sb.length()-1);
        return "[" + sb.toString() + ']';
    }
}
