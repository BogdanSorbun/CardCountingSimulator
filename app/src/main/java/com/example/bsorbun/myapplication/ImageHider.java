package com.example.bsorbun.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Scanner;
import java.util.Stack;
//
public abstract class ImageHider implements View.OnClickListener {
    private final CardSimulator main;

    public ImageHider(CardSimulator CardSimulator)
    {
        this.main = CardSimulator;
    }
    @Override
    public void onClick(View v) {
//        ImageView Card1 = v.findViewById(R.id.Card1);
//        ImageView Card2 = v.findViewById(R.id.Card2);
//        EditText text1 = v.findViewById(R.id.textView2);

//        String[] CardsValue = shuffler.shuffledDeck(1);
//        int CardName = cardImage.cardImage(CardsValue[0]);
//        text1.setText("Hello there");
//        Card1.setImageResource(CardName);
//        CardName = cardImage.cardImage(CardsValue[1]);
//        Card2.setImageResource(CardName);

    }

}