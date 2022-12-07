package com.example.mycal;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    Button b1,b2,b3,b4;
    TextView t3;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText) findViewById(R.id.t1);
        t2=(EditText) findViewById(R.id.t2);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        t3=(TextView) findViewById(R.id.t3);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int i =Integer.parseInt(t1.getText().toString());
                int j =Integer.parseInt(t2.getText().toString());
                int k=i+j;
                t3.setText("Addition is "+k);}
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int i =Integer.parseInt(t1.getText().toString());
                int j =Integer.parseInt(t2.getText().toString());
                int k=i-j;
                t3.setText("Addition is "+k);}
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int i =Integer.parseInt(t1.getText().toString());
                int j =Integer.parseInt(t2.getText().toString());
                int k=i*j;
                t3.setText("Addition is "+k); }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int i =Integer.parseInt(t1.getText().toString());
                int j =Integer.parseInt(t2.getText().toString());
                int k=i/j;
                t3.setText("Addition is "+k); }});}}
