package com.dinesh.card;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;

public class MainUser  extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_main);
        View card1 = findViewById(R.id.cardmenuriwayat);
        View card2 = findViewById(R.id.cardmenutransaksi);
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.card1:
                Intent intent = new Intent(MainUser.this, ListTransaksi.class);
                startActivity(intent);

                break;

            case R.id.card2:
                Intent intent1 = new Intent(MainUser.this, ListTransaksi.class);
                startActivity(intent1);
                break;
        }
    }
}
