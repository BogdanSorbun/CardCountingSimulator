package com.example.bsorbun.myapplication;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView=(TextView)findViewById(R.id.CardName);
        final Button PickCard =  (Button)findViewById(R.id.CardPicker);
        final ImageView card = findViewById(R.id.imageView);

        PickCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String[] CardsValue = shuffler.shuffledDeck(1);
                int CardName = cardImage.cardImage(CardsValue[0]);
                textView.setText(CardsValue[0]);
                card.setImageResource(CardName);
            }         });
    }


}
