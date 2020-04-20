class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
public class SearchElementFromLinkedList {
    Node head;
    public void insert(int data){
        Node newnode=new Node((data));
        newnode.next=null;
        if(head==null){
            head=newnode;
        }
        else {
            Node last=head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newnode;
        }
    }

    public void display(){
        Node current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println();
    }
    public void search(int data){
        Node temp=head;
        while (temp.data!=data){
            temp=temp.next;
        }
        if(temp.data==data) {
            System.out.println(temp.data + " found.");
        }
    }
    public static void main(String[] args) {
        SearchElementFromLinkedList obj=new SearchElementFromLinkedList();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.display();
        obj.search(30);
    }
}
