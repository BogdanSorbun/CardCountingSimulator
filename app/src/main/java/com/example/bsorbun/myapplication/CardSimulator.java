package com.example.bsorbun.myapplication;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CardSimulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            int UI_OPTIONS = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;
            getWindow().getDecorView().setSystemUiVisibility(UI_OPTIONS);
        }
        setContentView(R.layout.activity_card_simulator);
        final TextView textView=(TextView)findViewById(R.id.CardName);
        final Button PickCard =  (Button)findViewById(R.id.CardPicker);
        final ImageView card = findViewById(R.id.imageView);

        PickCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String[] CardsValue = shuffler.shuffledDeck(1);
                int CardName = cardImage.cardImage(CardsValue[0]);
                textView.setText(CardsValue[0]);
                card.setImageResource(CardName);
            }        });
        }
}
