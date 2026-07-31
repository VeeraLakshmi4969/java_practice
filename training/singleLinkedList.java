class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    void insert(int data){
    Node newNode = new Node(data);
    if(head==null){
        head = newNode;
        return;
    }

    Node temp = head;
    while(temp.next!=null){
        temp= temp.next;
    }
    temp.next= newNode;
}
void display(){
    Node temp = head;
    while(temp.next!=null){
        System.out.print(temp.data+" => ");
        temp = temp.next;
    }
    System.out.print("null");
}
}
class singleLinkedList{
    public static void main(String[] args) {
        LinkedList l =new LinkedList();
        l.insert(10);
        l.insert(30);
        l.insert(40);
        l.insert(20);
        l.insert(60);
        l.display();
    }
}