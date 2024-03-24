package ru.mirea.vorobevavi.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Activity перезапущена");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Activity активна");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Activity на паузе");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Activity остановлена");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Activity уничтожена");
    }
}