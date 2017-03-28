package com.example.alexi_000.shuntingyard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity
{

    private EditText input;
    private TextView dQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.input = (EditText)this.findViewById(R.id.inputET);
        this.dQueue = (TextView)this.findViewById(R.id.outputTV);
    }

    public void processButtonPressed(View v)
    {
        StringTokenizer st = new StringTokenizer(this.input.getText().toString(), "+-*/", true);
        Queue q = new Queue();
        Stack s = new Stack();
        while(st.hasMoreTokens())
        {
            if(st.nextToken() == "+" || st.nextToken() == "-" || st.nextToken() == "*" || st.nextToken() == "/")
            {
                s.push(st.nextToken());
            }
            else
            {
                q.enqueue(st.nextToken());
            }
        }
        String answer = "";
        while(q.getCount() > 0)
        {
            answer = answer + q.dequeue().getPayLoad() + " ";
        }
        while(s.peek() != null)
        {
            answer = answer + s.pop();
        }
        this.dQueue.setText(answer);
    }
}
