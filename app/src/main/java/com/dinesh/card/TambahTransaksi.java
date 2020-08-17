package com.dinesh.card;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class TambahTransaksi extends AppCompatActivity implements View.OnClickListener {

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        View card1 = findViewById(R.id.card1);

        card1.setOnClickListener(this);


        }
        @Override
        public void onClick(View v) {

        }

}
