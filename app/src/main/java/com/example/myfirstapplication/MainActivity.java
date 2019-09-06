package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    TextView textView1;
    EditText editText1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        textView1 = findViewById(R.id.text_view1);
        editText1 = findViewById(R.id.edit_text1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readText();
                Toast.makeText(MainActivity.this, "Text", Toast.LENGTH_LONG).show();
            }
        });
    }

    void readText() {
        String text = editText1.getText().toString();
        textView1.setText(text + " - OK");
    }
}
