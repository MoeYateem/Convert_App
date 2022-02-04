package com.example.lebanesemarketrate;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickConvert(View view) {
        TextView conversionTextView = findViewById(R.id.output);
        EditText lbpEditText = findViewById(R.id.lbp_edit_text);
        EditText usdEditText = findViewById(R.id.usd_edit_text);
        if (!lbpEditText.getText().toString().equals("")) {
            String lbpValue = lbpEditText.getText().toString();
            BigDecimal usd = new BigDecimal(Double.parseDouble(lbpValue) / 22000);
            conversionTextView.setText(lbpValue + "LBP = " + String.valueOf(usd) + "$");
        }

        else {

            String usdValue = usdEditText.getText().toString();
            BigDecimal lbp = new BigDecimal(Double.parseDouble(usdValue) * 22000);
            conversionTextView.setText(usdValue + "$ = " + String.valueOf(lbp) + "LBP");
        }
    }
}