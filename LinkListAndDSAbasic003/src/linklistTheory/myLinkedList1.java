package linklistTheory;

public class myLinkedList1 {

    //step 6 = create our ll custom class-->

    // step 7= set node start
    Node start;

    // step 8 = create a method for adding the element -->
    public void add(Integer data) {

        // create the node object referance for adding the data-->
        Node node = new Node(data);

        // check the start node referance value if it is null the ll is empty so make start the
        if (start == null) {
            start = node;
        } else {
            // traverse the ll until we don't get null or end element of ll -->
            Node temp = start;

            // when we get null then comes out form while loop and set temp next as node
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            }
            temp.setNextNode(node);
        }
    }

    // step 9 = create a method for printing the ll ---> travers the ll and print until we don't get null
    public void print() {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.getData() + "-->");
            temp = temp.getNextNode();
        }
    }

    // step 10---> create a method for delete an element form ll -->
    public void delete(Integer data) {
        Node temp = start;

        // check if start is null then we say the ll is empty
        if (start == null) {
            System.out.println("list is empty");

            // we check 1st element if we get 1st element as deleting element  than we set start  next to next
        } else if (start.getData().equals(data)) {
            start = start.getNextNode();
        } else {

            // for finding the deleting element we travrse the ll if we have two condition one the ll is not contian element & we fet delete element
            while (temp.getNextNode() != null && !temp.nextNode.getData().equals(data)) {
                temp = temp.getNextNode();
            }
            if (temp.getNextNode() != null) {
                // we find the element which we want to delete
                temp.setNextNode(temp.getNextNode().getNextNode());
            }
        }
    }


    //step 1=create node class and create data and next reference
    class Node {
        private Integer data;
        private Node nextNode;

        // step 2= put data in the node
        public Node(Integer data) {
            this.data = data;
        }

        // step 3 = setnext node reference
        public void setNextNode(Node node) {
            this.nextNode = node;
        }


        // step 4= get the next node refernce  for creating the linked list
        public Node getNextNode() {
            return nextNode;
        }

        // step 5 = get data of any node return as integer value
        public Integer getData() {
            return data;
        }

    }
}