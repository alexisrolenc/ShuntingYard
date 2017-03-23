package com.example.alexi_000.shuntingyard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private EditText input;
    private Queue mQueue;
    private TextView dQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mQueue = new Queue();
        this.input = (EditText)this.findViewById(R.id.inputET);
        this.dQueue = (TextView)this.findViewById(R.id.outputTV);
    }

    public void runButton(View v)
    {
        String mathEquation = this.input.getText().toString();
        String[] mathArray = mathEquation.split("\\s");
        mathEquation = "";
        for(int i = 0; i < mathArray.length; i++)
        {
            this.mQueue.enqueue(mathArray[i]);
        }

        while(this.mQueue.getCount() > 0)
        {
            mathEquation = mathEquation + " " + this.mQueue.dequeue();
        }
        this.dQueue.setText(mathEquation);
    }
}
