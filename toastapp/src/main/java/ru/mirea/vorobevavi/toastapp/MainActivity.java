package ru.mirea.vorobevavi.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
    }
    public void Calc(View v){
        EditText textinput = findViewById(R.id.editTextText);
        String textToCalc = textinput.getText().toString();
        String number_of_simvols = Integer.toString(textToCalc.length());
        String message = "СТУДЕНТ № 7 ГРУППА 5 Количество символов - "+ number_of_simvols;
        Toast toast = Toast.makeText(this,
                message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
}