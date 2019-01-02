package com.example.bsorbun.myapplication;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class CardSimulator extends AppCompatActivity {
    Button button= (Button) findViewById(R.id.HitMe);
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

        button.setOnClickListener(new inner(this));

//        final Button PickCard =  (Button)findViewById(R.id.CardPicker);
//        final ImageView Card1 = findViewById(R.id.Card1);
//        final ImageView Card2 = findViewById(R.id.Card2);
//
//        PickCard.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                String[] CardsValue = shuffler.shuffledDeck(1);
//                int CardName = cardImage.cardImage(CardsValue[0]);
//                Card1.setImageResource(CardName);
//                CardName = cardImage.cardImage(CardsValue[1]);
//                Card2.setImageResource(CardName);
//            }        });
        }
    private class inner extends ImageHider.TestButton {
        public inner(CardSimulator mainActivity)
        {
            super(mainActivity);
        }
    };
}
