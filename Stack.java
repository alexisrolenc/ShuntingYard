package com.example.alexi_000.shuntingyard;

/**
 * Created by alexi_000 on 3/23/2017.
 */

public class Stack
{
    private Node top;
    private int count;
    public Stack()
    {
        this.top = null;
        this.count = 0;
    }

    public void push(String payload)
    {
        Node n = new Node(payload);
        if(this.top == null)
        {
            this.top = n;
        }
        else
        {
            n.setNextNode(this.top);
            this.top = n;
        }
        this.count++;
    }

    public String pop()
    {
        if(this.top == null)
        {
            throw new RuntimeException("Can't pop from empty stack...");
        }
        else
        {
            String valToReturn = this.top.getPayLoad();
            this.top = this.top.getNextNode();
            this.count--;
            return valToReturn;
        }
    }

    public String peek()
    {
        if(this.top == null)
        {
            throw new RuntimeException("Empty Stack...");
        }
        else
        {
            return this.top.getPayLoad();
        }
    }

    public void display()
    {
        if(this.count == 0)
        {
            System.out.println("Empty Stack");
        }
        else
        {
            Stack temp = new Stack();
            int tempCount = this.count;
            for(int i = 0; i < tempCount; i++)
            {
                System.out.print(this.peek() + " -> ");
                temp.push(this.pop());
            }
            System.out.println("null");
            tempCount = temp.count;
            for(int i = 0; i < tempCount; i++)
            {
                this.push(temp.pop());
            }
        }
    }
}
