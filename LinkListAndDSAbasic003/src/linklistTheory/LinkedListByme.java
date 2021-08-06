package linklistTheory;

public class LinkedListByme {

    // step 2= create a head of linkedlist
    Node head ;



    // Step 3= add function for adding the element to ahead of list-

     void add(int data){
         Node toAdd=new Node(data);
         if(head==null){
             head=toAdd;
             return;
         }else{
             Node temp=head;
             while (temp.next!=null){
                 temp=temp.next;
             }
             temp.next=toAdd;
         }

     }


     // step 4 =print the linkedlist  by creating a print functtion

    void print(){
         Node temp=head;
         while (temp!=null){
             System.out.print(temp.data+" ");
             temp=temp.next;
         }
    }






     //step 1 =create a class for creating a node

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next=null;
        }
    }

}
