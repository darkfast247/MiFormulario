package com.example.miformulario;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Esto enlaza el layout activity_main.xml con esta actividad

        Log.d(TAG, "onCreate: La actividad ha sido creada");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: La actividad está a punto de hacerse visible");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: La actividad ha entrado en el estado Resumed y está interactuando con el usuario");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: La actividad está a punto de entrar en el estado Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: La actividad ya no es visible para el usuario");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: La actividad está a punto de ser destruida");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: La actividad está a punto de volver a ser iniciada");
    }
}
