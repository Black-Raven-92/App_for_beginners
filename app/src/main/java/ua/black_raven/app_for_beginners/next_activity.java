package ua.black_raven.app_for_beginners;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class next_activity extends AppCompatActivity {
    boolean flag;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_activity);

        checkBox = findViewById(R.id.checkBox3);
        checkBox.setOnClickListener(v->{
            flag=true;
        });


    }



    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("flag", flag);
    }
}