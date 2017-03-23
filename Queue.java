package com.example.alexi_000.shuntingyard;

/**
 * Created by alexi_000 on 3/23/2017.
 */

public class Queue
{
    private Node head;
    private int count;

    public Queue()
    {
        this.head = null;
        this.count = 0;
    }

    public int getCount()
    {
        return count;
    }

    public String dequeue()
    {
        if(this.count == 0)
        {
            throw (new RuntimeException("Can't remove from empty queue..."));
        }
        else
        {
            Node currFront = this.head;
            this.head = this.head.getNextNode();
            currFront.setNextNode(null);
            this.count++;
            return currFront.getPayLoad();
        }
    }

    public void enqueue(String s)
    {
        Node n = new Node(s);
        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
            Node currNode = this.head;
            while (currNode.getNextNode() != null) {
                currNode = currNode.getNextNode();
            }
            currNode.setNextNode(n);
        }
        this.count++;
    }
}
