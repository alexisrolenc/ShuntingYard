package com.example.alexi_000.shuntingyard;

/**
 * Created by alexi_000 on 3/23/2017.
 */

public class Node
{
    private String payLoad;
    private Node nextNode;

    public Node(String payLoad)
    {
        this.payLoad = payLoad;
    }

    public String getPayLoad()
    {
        return payLoad;
    }

    public Node getNextNode()
    {
        return nextNode;
    }

    public void setPayLoad(String payLoad)
    {
        this.payLoad = payLoad;
    }

    public void setNextNode(Node nextNode)
    {
        this.nextNode = nextNode;
    }
}
