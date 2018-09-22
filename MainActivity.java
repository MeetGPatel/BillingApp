package com.example.meet.billingapp_meet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtpizza,edtsamosa,edtburger,edtpuff;
    Button btnorder;
    int pizzaqu,pizzaamount=300,pizzatotal;
    int samosaque,samosaamount=10,samosatotal;
    int burgerque,burgeramount=25,burgertotal;
    int puffque,puffamount=10,pufftotal;
    int total;

    LinearLayout laypizza,laysamosa,layburger,laypuff;
    TextView tvreceipt,tvbilpizza,tvbilsamosa,tvbilburger,tvbilpuff;
    TextView tvfinaltotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtpizza = (EditText)findViewById(R.id.edtpizza);
        edtsamosa = (EditText)findViewById(R.id.edtsamosa);
        edtburger = (EditText)findViewById(R.id.edtburger);
        edtpuff = (EditText)findViewById(R.id.edtpuff);
        btnorder = (Button)findViewById(R.id.btnorder);

        laypizza = (LinearLayout)findViewById(R.id.laypizza);
        laysamosa = (LinearLayout)findViewById(R.id.laysamosa);
        layburger = (LinearLayout)findViewById(R.id.layburger);
        laypuff = (LinearLayout)findViewById(R.id.laypuff);

        tvbilpizza = (TextView)findViewById(R.id.tvbillpizza);
        tvbilsamosa = (TextView)findViewById(R.id.tvbillsamosa);
        tvreceipt = (TextView)findViewById(R.id.tvreceipt);
        tvbilburger = (TextView)findViewById(R.id.tvbillburger);
        tvbilpuff = (TextView)findViewById(R.id.tvbillpuff);

        tvfinaltotal = (TextView)findViewById(R.id.tvfinaltotal);


        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total = 0;
                pizzatotal=0;
                samosatotal=0;
                burgertotal=0;
                pufftotal=0;

                tvfinaltotal.setText("TOTAL = ");
                tvfinaltotal.setVisibility(View.VISIBLE);

                //if(edtpizza.getText().toString().length() == 0)
                if(edtpizza.getText().toString().isEmpty())
                {
                    laypizza.setVisibility(View.GONE);
                    //Toast.makeText(MainActivity.this, "Plz enter que", Toast.LENGTH_SHORT).show();
                }
                else
                    {
                        pizzaqu = Integer.parseInt(edtpizza.getText().toString());
                        pizzatotal = pizzaamount * pizzaqu;
                        laypizza.setVisibility(View.VISIBLE);
                        tvbilpizza.setText(String.valueOf(pizzaqu));
                        //Toast.makeText(MainActivity.this, "Total = "+pizzatotal, Toast.LENGTH_SHORT).show();
                    }
                if(edtsamosa.getText().toString().length() == 0)
                {
                    laysamosa.setVisibility(View.GONE);
                    //Toast.makeText(MainActivity.this, "Plz enter que", Toast.LENGTH_SHORT).show();
                }
                    else
                    {
                    samosaque = Integer.parseInt(edtsamosa.getText().toString());
                    samosatotal = samosaamount * samosaque;
                    laysamosa.setVisibility(View.VISIBLE);
                    tvbilsamosa.setText(String.valueOf(samosaque));
                    //Toast.makeText(MainActivity.this, "Total = "+pizzatotal, Toast.LENGTH_SHORT).show();
                    }
                if(edtburger.getText().toString().isEmpty())
                {
                    layburger.setVisibility(View.GONE);
                    //Toast.makeText(MainActivity.this, "Plz enter que", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    burgerque = Integer.parseInt(edtburger.getText().toString());
                    burgertotal = burgeramount * burgerque;
                    layburger.setVisibility(View.VISIBLE);
                    tvbilburger.setText(String.valueOf(burgerque));
                    //Toast.makeText(MainActivity.this, "Total = "+pizzatotal, Toast.LENGTH_SHORT).show();
                }
                if(edtpuff.getText().toString().length() == 0)
                {
                    laypuff.setVisibility(View.GONE);
                    //Toast.makeText(MainActivity.this, "Plz enter que", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    puffque = Integer.parseInt(edtpuff.getText().toString());
                    pufftotal = puffamount * puffque;
                    laypuff.setVisibility(View.VISIBLE);
                    tvbilpuff.setText(String.valueOf(puffque));
                    //Toast.makeText(MainActivity.this, "Total = "+pizzatotal, Toast.LENGTH_SHORT).show();
                }
                 total = pizzatotal + samosatotal + burgertotal + pufftotal;
                tvreceipt.setVisibility(View.VISIBLE);
                tvfinaltotal.setText(tvfinaltotal.getText().toString() + total );
                //Toast.makeText(MainActivity.this, "Toatal = "+total, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
