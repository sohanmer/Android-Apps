package com.example.temperaturebycricketchirps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etChirpsCount;
    Button btnCalculateTemperature;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etChirpsCount = findViewById(R.id.etChripsCount);
        btnCalculateTemperature = findViewById(R.id.btnCricketTemperature);
        tvResult = findViewById(R.id.tvResult);

        tvResult.setVisibility(View.GONE);

        btnCalculateTemperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int chirpsCount = Integer.parseInt(etChirpsCount.getText().toString().trim());

                float temperatureCelcius;

                temperatureCelcius = (chirpsCount/3) + 4;

                String result;

                result = getString(R.string.result) + temperatureCelcius + " " + getString(R.string.temperatureUnit);

                tvResult.setText(result);

                tvResult.setVisibility(View.VISIBLE);

            }
        });

    }
}