package ru.mirea.vorobevavi.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickNewActivity(View view) {
        TextInputEditText textinput = findViewById(R.id.textinput);
        String textToSend = textinput.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", textToSend);
        startActivity(intent);
    }
}