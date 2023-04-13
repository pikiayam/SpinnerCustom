package com.vickyhadisaputra202102353.spinnercustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerx = (Spinner)findViewById(R.id.spinnerx);

        List<String> negaraList = new ArrayList<>();
        negaraList.add("Albania");
        negaraList.add("Belgia");
        negaraList.add("Hungary");
        negaraList.add("Iran");
        negaraList.add("Slovenia");

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraList);
        spinnerx.setAdapter(na);

    }
}