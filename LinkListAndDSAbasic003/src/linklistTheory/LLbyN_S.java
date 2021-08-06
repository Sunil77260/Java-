package linklistTheory;

public class LLbyN_S{
    // step 2= creating the list--->
   private Node start;

   // step 3= adding the element in the list-->

    public  void add(Integer data){
        Node node= new Node(data);
        if(start==null){
            start=node;
        }else {
            Node temp=start;
            while (temp.getNextNode()!=null){
                temp=temp.getNextNode();
            }
            temp.setNextNode(node);
        }
    }


    // step 4 = printing the list -->

    public  void print(){
        Node temp =start;
        while (temp!=null){
            System.out.print(temp.getData()+"-->");
            temp=temp.getNextNode();
        }
    }


    // step 5 = delete an element in the ll-->

    public  void delete(Integer data){
        Node temp=start;
        if(start==null){
            System.out.print("List is empty");
        }else if(start.getData().equals(data)){
            start =start.getNextNode();

        }else {
            while (temp.getNextNode()!=null&&!temp.getNextNode().getData().equals(data)){
                temp=temp.getNextNode();
            }
            if(temp.getNextNode()!=null){
                System.out.println("We find the element which will be delele");
                temp.setNextNode(temp.getNextNode().getNextNode());
            }
        }
    }

    // step 1= create a node class and put the data after that we create some method for set node , getnextnode, get data--->

    class  Node{
       private Integer data;
        private Node nextNode;

        public  Node(Integer data){

            this.data=data;
        }
     public void setNextNode(Node node){

            this.nextNode=node;
     }
     public Node getNextNode(){
            return nextNode;
     }
      public Integer getData(){

            return data;
      }




    }
}
