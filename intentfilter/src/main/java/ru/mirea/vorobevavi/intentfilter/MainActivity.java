package ru.mirea.vorobevavi.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public void ShareClick(View v) {
        String fullName = "ВОРОБЬЕВА ВИКТОРИЯ ИСЛАМОВНА";
        String university = "MIREA";

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, university);
        shareIntent.putExtra(Intent.EXTRA_TEXT, fullName);
        startActivity(Intent.createChooser(shareIntent, "МОИ ФИО"));
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Click(View view){
        Uri address = Uri.parse("https://www.mirea.ru/");
        Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
        startActivity(openLinkIntent);
    }
}