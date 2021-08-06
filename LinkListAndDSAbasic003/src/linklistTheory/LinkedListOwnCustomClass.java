package linklistTheory;

public class LinkedListOwnCustomClass {
    //start with head node
    Node head;

    void add(int data){
        Node toAdd=new Node(data);    //create a new node and now search where we want to add start from add

       /* if(head==null){
            head=toAdd;
            return;
            }
        */
      if(isEmpty()){
          head=toAdd;
          return;
      }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
    }
   boolean isEmpty(){
        return head==null;
   }

   // create a function for printing the linkedlist
    void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }


//creation of a node
    static class  Node{
        int data;
        Node next;


        //constracter for  putting a data inside the Node
    public Node(int data){
        this.data=data;
        next=null;
    }

    }
}
