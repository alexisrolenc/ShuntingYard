package com.example.alexi_000.shuntingyard;

/**
 * Created by alexi_000 on 3/23/2017.
 */

public class Queue
{
    private Node front;
    private Node end;
    private int count;

    public Queue()
    {
        this.front = null;
        this.end = null;
        this.count = 0;
    }

    public int getCount()
    {
        return count;
    }

    public Node dequeue()
    {
        Node nodeToReturn = this.front;
        if(this.front != null)
        {
            this.front = nodeToReturn.getNextNode();
            nodeToReturn.setNextNode(null);
            this.count--;
        }
        return nodeToReturn;
    }

    public void enqueue(String value)
    {
        Node n = new Node(value);
        this.count++;
        if(this.end == null)
        {
            this.front = n;
            this.end = n;
        }
        else
        {
            this.end.setNextNode(n);
            this.end = n;
        }
    }
}
