class Node{
    int data;
    Node next;
}

class dsa{
    public static void main(String[] args) {
        Node head = new Node();
        Node second = new Node();
        Node tail = new Node();

        head.data = 10;
        second.data = 20;
        tail.data = 30;

        head.next = second;
        second.next = tail;
        tail.next = null;

        Node temp = head;
    
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}