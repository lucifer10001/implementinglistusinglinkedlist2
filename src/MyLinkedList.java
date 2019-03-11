import sun.awt.geom.AreaOp;

public class MyLinkedList {
    public static void main(String[] args) {
        Node head;
        head=new Node();
        head.data=10;
        head.next=null;
        Node element=new Node();
        head.next=element;
        Node element2=new Node();
        element.next=element2;
        Node element3=new Node();
        element2.next=element3;
        Node element4=new Node();
        element3.next=element4;
        Node element5=new Node();
        element4.next=element5;
        element.data=20;
        element2.data=5;
        element3.data=50;
        element3.next=null;
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;

        }
        System.out.println("null");

    }
}

class Node{
    int data;
    Node next;

}
