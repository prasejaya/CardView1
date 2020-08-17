package com.dinesh.card;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View card1 = findViewById(R.id.card1);
        View card2 = findViewById(R.id.card2);
        View card3 = findViewById(R.id.card3);
        View card4 = findViewById(R.id.card4);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, ListTransaksi.class);
                startActivity(new Intent(MainActivity.this,ListTransaksi.class));
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,TambahTransaksi.class);
                startActivity(intent1);
            }
        });

    }

    @Override
    public void onClick(View v) {

       /* switch (v.getId()) {

            case R.id.card1:


                break;
            case R.id.card2:

        }*/
    }
}