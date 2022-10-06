package link_list;

public class list {
    class Node
    {
       int data;
       Node next;
       public Node(int data)
       {
        this.data=data;
        this.next=null;
       }
       public Node head=null;
       public Node tail=null;
    public void add(int data)
       {
        Node newnode=new Node(data);

        if(head==null)
        {
            head=newnode;
            tail=newnode;

        }
        else 
        {
            tail.next=newnode;
            tail=newnode;
        }
    }
        public void display() {    
            //Node current will point to head    
            Node current = head;    
                
            if(head == null) {    
                System.out.println("List is empty");    
                return;    
            }    
            System.out.println("Nodes of singly linked list: ");    
            while(current != null) {    
                //Prints each node by incrementing pointer    
                System.out.print(current.data + " ");    
                current = current.next;    
            }    
            System.out.println();    
        }    
       }

    
    public static void main(String[] args) {
        list linkList=new list();
        linkList.add(1);
        linkList.add(2);


        
    }
    
    
}
