package com.coding.a17currencyconveyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro, pound, dollar, yen, dinar, bitcoin, rubel, ausdollar, candollar;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.bitcoin);
        rubel = findViewById(R.id.rubel);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);


        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String z = editText.getText().toString();
                //we have created every thing as string so that the app doesnot crash when pass dollar sign.

                //TextUtils to get red error msg
                if(TextUtils.isEmpty(z)) {
                    editText.setError("Empty User Input");
                } else {
                    double n, k;

                    //here converting the string to doubles.pars double
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter(); //helps to format the value
                    k = n + 0.012;

//                    professional way
                    DecimalFormat numberformat = new DecimalFormat("#.00");
                    textView.setText("" + numberformat.format(k));

//                    easy way but both work same
//                    textView.setText(""+k);

                }

            }
        });

    }
}