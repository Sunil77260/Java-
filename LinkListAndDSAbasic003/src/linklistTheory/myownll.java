package linklistTheory;

public class myownll {
    Node start;

    // adding element in the list
    public void add(Integer data){
        Node node=new Node(data);
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

    // create a method fir printing the element
    public void print(){
        Node temp=start;
        while (temp!=null){
            System.out.print(temp.getData()+"-->");
        }
    }


    // creating the node class for starting the list for value now we can add some of the keken t ub tgus kiussrn
    class Node{
        private Integer data;
        private Node nextNode;
        public Node(Integer data){
            this.data=data;
        }
        public void setNextNode(Node node){
            this.nextNode=node;
        }
        public Node getNextNode(){
            return nextNode;
        }
        public Integer getData(){
            return  data;
        }
    }

}

