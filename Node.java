//Node.java

import java.io.Serializable;
/**
 * The main entity being used is the Node
 */
public class Node<T> implements Serializable
{
    private T data;
    private Node<T> next;

    Node (T dataPortion)
    {
        this.data= dataPortion;
        this.next = null;
    }
    
    private Node(T dataPortion, Node<T> nextNode)
    {
        this.data = dataPortion;
        this.next = nextNode;
    }
/**
 * Method does as it's namesake, gets the data.
 * Said data is then returned to user and then changed
 * for the next one.
 */
    T getData()
    {
        return this.data;
    }
/**
 * Method sets the new data to the current data.
 */
    void setData(T newData)
    {
        this.data = newData;
    }
/**
 * Method gets new/next node and returns old/current node. 
 */
    Node<T> getNextNode()
    {
        return this.next;
    }
/**
 * Method sets new node to current node.
 */
    void setNextNode(Node<T> nextNode)
    {
        this.next = nextNode;
    }

    

}
