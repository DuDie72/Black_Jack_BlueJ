public class Node
{
     private Object content = null;
     private Node nextNode = null;

        public Node(Object pObject, Node pNode) {
            content = pObject;
            nextNode = pNode;
        }

        public void setNext(Node pNext) {
            nextNode = pNext;
        }

        public Node getNext() {
            return nextNode;
        }

        public Object getContent() {
             return content;
        }
} 
