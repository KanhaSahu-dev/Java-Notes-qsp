class Node{
    int value;
    Node next;
    int size;
    Node head;
    Node tail;
    public void append(int value){
        Node node = new Node();
        node.value=value;
        if(size==0){
            node.next=null;
            head = node;
            tail=node;
            size++;
        }
        else{
            tail.next=node;
            node.next=null;
            tail=node;
            size++;
        }
    }
    
    public void display(Node node){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
}

public class class42 {
    public static void main(String[] args) {
        Node node = new Node();
        node.append(1);
        node.append(2);
        node.append(3);
        node.append(4);
        node.append(5);
        node.append(6);
        node.display(node);
    }
}
