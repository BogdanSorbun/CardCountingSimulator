package com.example.bsorbun.myapplication;

public class cardImage {
    public static int cardImage(String card) {
        int CardName = R.drawable.back;
//        String[] Cards = shuffler.shuffledDeck(1);
        String CardValue = card;

        switch (CardValue) {
            case "A of Club":
                return R.drawable.ace_of_clubs;
            case "A of Diamond":
                return R.drawable.ace_of_diamonds;
            case "A of Spade":
                return R.drawable.ace_of_spades;
            case "A of Heart":
                return R.drawable.ace_of_hearts;
            case "2 of Club":
                return R.drawable.two_of_club;
            case "2 of Diamond":
                return R.drawable.two_of_diamonds;
            case "2 of Heart":
                return R.drawable.two_of_hearts;
            case "2 of Spade":
                return R.drawable.two_of_spades;
            case "3 of Club":
                return R.drawable.three_of_clubs;
            case "3 of Diamond":
                return R.drawable.three_of_diamonds;
            case "3 of Heart":
                return R.drawable.three_of_hearts;
            case "3 of Spade":
                return R.drawable.three_of_spades;
            case "4 of Club":
                return R.drawable.four_of_clubs;
            case "4 of Diamond":
                return R.drawable.four_of_diamonds;
            case "4 of Heart":
                return R.drawable.four_of_hearts;
            case "4 of Spade":
                return R.drawable.four_of_spades;
            case "5 of Club":
                return R.drawable.five_of_clubs;
            case "5 of Diamond":
                return R.drawable.five_of_diamonds;
            case "5 of Heart":
                return R.drawable.five_of_hearts;
            case "5 of Spade":
                return R.drawable.five_of_spades;
            case "6 of Club":
                return R.drawable.six_of_clubs;
            case "6 of Diamond":
                return R.drawable.six_of_diamonds;
            case "6 of Heart":
                return R.drawable.six_of_hearts;
            case "6 of Spade":
                return R.drawable.six_of_spades;
            case "7 of Club":
                return R.drawable.seven_of_clubs;
            case "7 of Diamond":
                return R.drawable.seven_of_diamonds;
            case "7 of Heart":
                return R.drawable.seven_of_hearts;
            case "7 of Spade":
                return R.drawable.seven_of_spades;
            case "8 of Club":
                return R.drawable.eight_of_clubs;
            case "8 of Diamond":
                return R.drawable.eight_of_diamonds;
            case "8 of Heart":
                return R.drawable.eight_of_hearts;
            case "8 of Spade":
                return R.drawable.eight_of_spades;
            case "9 of Club":
                return R.drawable.nine_of_clubs;
            case "9 of Diamond":
                return R.drawable.nine_of_diamonds;
            case "9 of Heart":
                return R.drawable.nine_of_hearts;
            case "9 of Spade":
                return R.drawable.nine_of_spades;
            case "10 of Club":
                return R.drawable.ten_of_clubs;
            case "10 of Diamond":
                return R.drawable.ten_of_diamonds;
            case "10 of Heart":
                return R.drawable.ten_of_hearts;
            case "10 of Spade":
                return R.drawable.ten_of_spades;
            case "J of Club":
                return R.drawable.jack_of_clubs;
            case "J of Diamond":
                return R.drawable.jack_of_diamonds;
            case "J of Heart":
                return R.drawable.jack_of_hearts;
            case "J of Spade":
                return R.drawable.jack_of_spades;
            case "Q of Club":
                return R.drawable.queen_of_clubs;
            case "Q of Diamond":
                return R.drawable.queen_of_diamonds;
            case "Q of Heart":
                return R.drawable.queen_of_hearts;
            case "Q of Spade":
                return R.drawable.queen_of_spades;
            case "K of Club":
                return R.drawable.king_of_clubs;
            case "K of Diamond":
                return R.drawable.king_of_diamonds;
            case "K of Heart":
                return R.drawable.king_of_hearts;
            case "K of Spade":
                return R.drawable.king_of_spades;
            }
            return CardName;
    }
}
