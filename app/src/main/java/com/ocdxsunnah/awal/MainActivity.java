package com.ocdxsunnah.awal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToast("Cek");
    }

    private void setToast(String cek) {
        Toast.makeText(this, cek, Toast.LENGTH_SHORT).show();
    }
}