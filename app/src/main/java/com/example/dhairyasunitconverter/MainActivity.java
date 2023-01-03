package com.example.dhairyasunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private TextView textView3;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        textView3= findViewById(R.id.textView3);
        editText= findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this, "CLICK WORKED", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int KG = Integer.parseInt(s);
                double pound = 2.205 * KG;
                textView3.setText("The corresponding pound value = "+ pound);
            }
    });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    String s = editText.getText().toString();
                    int KG = Integer.parseInt(s);
                    double gram = KG * 1000;
                    textView3.setText("The corresponding gram value = " + gram);
            }
        });
   // }}
}; };
