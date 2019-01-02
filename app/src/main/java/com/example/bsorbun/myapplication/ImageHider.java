package com.example.bsorbun.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Scanner;
import java.util.Stack;

public class ImageHider {

    /*
    This class is used to reduce the lines of code in the final product
     */
    public static class TestButton implements View.OnClickListener {

        private final CardSimulator main;

        public TestButton(CardSimulator mainActivity)
        {
            this.main = mainActivity;
        }

        @Override
        public void onClick(View v) {
            final ImageView Card1 = v.findViewById(R.id.Card1);
            final ImageView Card2 = v.findViewById(R.id.Card2);

            String[] CardsValue = shuffler.shuffledDeck(1);
            int CardName = cardImage.cardImage(CardsValue[0]);
            Card1.setImageResource(CardName);
            CardName = cardImage.cardImage(CardsValue[1]);
            Card2.setImageResource(CardName);
        };
//            final LinearLayout Layout1 = findViewById(R.id.linearLayout);
//            final ImageView Card1 = findViewById(R.id.Card1);
//            final LinearLayout Layout2 = findViewById(R.id.linearLayout2);
//            final ImageView Card2 = findViewById(R.id.Card2);
//            final LinearLayout Layout3 = findViewById(R.id.linearLayout3);
//            final ImageView Card3 = findViewById(R.id.Card3);
//            final LinearLayout Layout4 = findViewById(R.id.linearLayout4);
//            final ImageView Card4 = findViewById(R.id.Card4);
//            final LinearLayout Layout5 = findViewById(R.id.linearLayout5);
//            final ImageView Card5 = findViewById(R.id.Card5);
//            final LinearLayout Layout6 = findViewById(R.id.linearLayout6);
//            final ImageView Card6 = findViewById(R.id.Card6);
//            final LinearLayout Layout7 = findViewById(R.id.linearLayout7);
//            final ImageView Card7 = findViewById(R.id.Card7);
//            final LinearLayout Layout8 = findViewById(R.id.linearLayout8);
//            final ImageView Card8 = findViewById(R.id.Card8);
//            final LinearLayout Layout9 = findViewById(R.id.linearLayout9);
//            final ImageView Card9 = findViewById(R.id.Card9);
//            final LinearLayout Layout10 = findViewById(R.id.linearLayout10);
//            final ImageView Card10 = findViewById(R.id.Card10);
//            final LinearLayout Layout11 = findViewById(R.id.linearLayout11);
//            final ImageView Card11 = findViewById(R.id.Card11);
//
//            int CardValue = 0;
//            int HighAce = 11;
//            int LowAce = 1;
////            String[] Hand = new String[52 * number];
//            String[] Hand = new String[52];
//
//            Stack StackedDeck = new Stack();
////            String[] Deck = shuffler.shuffledDeck(number);
//            String[] Deck = shuffler.shuffledDeck(1);
//
//
//            for(String str : Deck){
//                StackedDeck.push(str);
//            }
//            /*
//            Not sure if this while loop works on the onclick view... I will program something out
//            but eventually fix the problem
//             */
//            while (callOnClick()) {
//                while (!StackedDeck.isEmpty()){
//                    int Total = 0;
//
//                    while (Total <= 21) {
//
//                        Hand[0] = StackedDeck.pop().toString();
//                        Layout1.setVisibility(View.VISIBLE);
//                        Card1.setImageResource(cardImage.cardImage(Hand[0]));
//                        CardValue = cards.cardValue(Hand[0]);
//                        Total = Total + CardValue;
//
//                        Hand[1] = StackedDeck.pop().toString();
//                        Layout2.setVisibility(View.VISIBLE);
//                        Card2.setImageResource(cardImage.cardImage(Hand[0]));
//                        CardValue = cards.cardValue(Hand[1]);
//                        Total = Total + CardValue;
//
//                        if (Hand[0].contains("A") && !Hand[1].contains("A")) {
//                            if (Total == 10) {
//                                Total = Total + HighAce;
//                                break;
//                            } else {
//                                Total = Total + HighAce;
//                            }
//                        }
//                        if (Hand[1].contains("A") && !Hand[0].contains("A")) {
//                            if (Total == 10) {
//                                Total = Total + HighAce;
//                                break;
//                            } else {
//                                Total = Total + HighAce;
//                            }
//                        }
//                        if (Hand[0].contains("A") && Hand[1].contains("A")) {
//                            Total = HighAce + LowAce;
//                        }
//
//                        Context context = context.getApplicationContext();
//                        CharSequence text = "Hit you?!";
//                        int duration = Toast.LENGTH_SHORT;
//
//                        Toast toast = Toast.makeText(context, text, duration);
//                        toast.show();
//
//
//                        while (callOnClick()) {
//
//                            Hand[2] = StackedDeck.pop().toString();
//                            Layout2.setVisibility(View.VISIBLE);
//                            Card3.setImageResource(cardImage.cardImage(Hand[2]));
//                            CardValue = cards.cardValue(Hand[2]);
//
//                            if (Hand[2].contains("A")) {
//                                Total = Total + HighAce;
//                                if (Total > 21) {
//                                    Total = Total - HighAce;
//                                    Total = Total - LowAce;
//                                    if (Total > 21) {
//                                        Total = 0;
//                                        break;
//                                    }
//                                    if (Total == 21) {
//                                        Total = 0;
//                                        break;
//                                    }
//                                } else {
//                                    Total = Total;
//                                }
//                            }
//                            Total = Total + CardValue;
//                            if (Total == 21) {
//                                Total = 0;
//                                break;
//                            }
//                            if (Total > 21) {
//                                Total = 0;
//                                break;
//                            }
//                            else {
//                                toast.show();
//                            }
//                        }
//                        break;
//                    }
///*				if (StackedDeck.isEmpty()){
//					System.out.println("We ran out, do you want more cards?");
//					Scanner answer = new Scanner(System.in);
//					int answers = answer.nextInt();
//					if (answers == 1){
//						for(String str : Deck){
//							StackedDeck.push(str);
//						}
//					}
//				} else {
//					break;
//				}*/
//                }
//            }
        }

    }