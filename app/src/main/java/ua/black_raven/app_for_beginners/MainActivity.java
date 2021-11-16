package ua.black_raven.app_for_beginners;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String text;
    private boolean flag1;

    Button nextBtn;
    TextView textView;
    ImageView imageView;
    Button helloBtn;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextBtn = findViewById(R.id.next_btn);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        editText = findViewById(R.id.editTextTextPersonName);
        helloBtn = findViewById(R.id.hello_btn);
        if (savedInstanceState != null) {
            flag1 = (boolean) savedInstanceState.getBoolean("flag");

        }
        nextBtn.setOnClickListener(v ->
        {
            Intent intent = new Intent(MainActivity.this, NextActivity.class);
            startActivity(intent);

        });
        helloBtn.setOnClickListener(v -> {
            if (flag1) {
                initHi();
            } else {
                initHello();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    public void initHello() {
        text = String.valueOf(editText.getText());
        textView.setText("Привет," + text);
        imageView.setImageResource(R.drawable.privet);
    }

    public void initHi() {
        text = String.valueOf(editText.getText());
        textView.setText("Здороооуу," + text);
        imageView.setImageResource(R.drawable.pacan);
    }
}